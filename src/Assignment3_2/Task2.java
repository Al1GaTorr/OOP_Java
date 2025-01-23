package Assignment3_2;

public class Task2 {
    public static class Skyscraper {
        public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
        public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
                "Небоскреб построен. Количество этажей - ";
        public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER =
                "Небоскреб построен. Застройщик - ";
        public Skyscraper(){
            System.out.println(SKYSCRAPER_WAS_BUILD);
        }
        public Skyscraper(int floors){
            System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
        }
        public Skyscraper(String developer){
            System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);

        }

    }
    public static void main(String[] args) {
        new Skyscraper();
        new Skyscraper(50);
        new Skyscraper("JavaRushDevelopment");
    }
}