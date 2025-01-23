package Assignment3_1;

public class Task6 {
    public static void main(String[] args) throws Exception {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }
    public static class Screen implements Selectable, Updatable {
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}

