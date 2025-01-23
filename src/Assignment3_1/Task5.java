package Assignment3_1;

public class Task5 {
    public static void main(String[] args) throws Exception {
}
    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }
    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }
    public static class BeerLover implements Alcoholic{
        @Override
        public boolean isReadyToGoHome() {
            return false;
        }

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public void sleepOnTheFloor() {

        }
    }
}

