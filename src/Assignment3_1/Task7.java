package Assignment3_1;

public class Task7 {
    public static void main(String[] args) {
    System.out.println(Dream.HOBBY.toString());
    System.out.println(new Hobby().toString());
}
    interface Dream {
       Hobby HOBBY = new Hobby();
    }
    interface Desire{
    }

    static class Hobby implements Desire, Dream{
        static int INDEX = 1;
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
