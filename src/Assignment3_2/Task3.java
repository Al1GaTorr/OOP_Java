package Assignment3_2;

public class Task3 {
    public static class Skyscraper {
        private int floorsCount;
        private String developer;

        // Default constructor
        public Skyscraper() {
        }

        // Constructor with parameters
        public Skyscraper(int floorsCount, String developer) {
            this.floorsCount = floorsCount;
            this.developer = developer;
            System.out.println("Developer is "+developer);
            System.out.println("Number of floors is " + floorsCount);
        }


    }
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
    }
}
