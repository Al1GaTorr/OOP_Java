package Assignment3_2;

public class Task12 {
    public class Market {
        private static boolean hasEggs = true;
    }
    public static void main(String[] args) {
        boolean hasEggs = true;
        makePurchases(hasEggs);
    }
    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }

}
