package Assignment3_1;

public class Task3 {
    public static void main(String[] args) {}
        public interface CanFly {
            public void fly();
        }
        public interface CanRun {
            public void run();
        }
        public interface CanSwim {
            public void swim();
        }
        public class Human implements CanRun, CanSwim {
            @Override
            public void run() {
            }

            @Override
            public void swim() {
            }
        }
        public class Duck implements CanSwim, CanRun, CanFly{
            @Override
            public void fly() {

            }

            @Override
            public void run() {

            }

            @Override
            public void swim() {

            }
        }
        public class Penguin implements CanRun, CanSwim{
            @Override
            public void swim() {

            }

            @Override
            public void run() {

            }
        }
        public class Airplane implements CanFly{
            @Override
            public void fly() {

            }
        }
    }