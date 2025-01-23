package Assignment3_1;

public class Task9 {
    public static void main(String[] args) throws Exception {
    }
    interface CanMove{
        double speed();
    interface CanFly extends CanMove {
        @Override
        double speed();
    }
    }
}
