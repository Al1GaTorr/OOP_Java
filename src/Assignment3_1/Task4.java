package Assignment3_1;

public class Task4 {
    public static void main(String[] args) {
    }
    interface CanRun{
        void run();
    }
    interface CanSwim{
        void swim();
    }
    public abstract class Human implements CanRun, CanSwim{

    }
}
