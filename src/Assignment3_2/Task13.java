package Assignment3_2;

public class Task13 {
    public static class Hedgehog {
        public static class Apple {
    }
    public void eat(Apple apple) {
            System.out.println("Яблоко было съедено!");
    }


    }
    public static void main(String[] args) {
        Hedgehog hedgehog = new Hedgehog();
        Hedgehog.Apple pineapple = new Hedgehog.Apple();
        hedgehog.eat(pineapple);
    }
}
