package Assignment3_2;

public class Task14 {
    public static void showWeather(City city) {
        System.out.println("In " + city.getName() + ", the current temperature is " + city.getTemperature() + "C.");
    }
    public static class City {
    private String name;
    private int temperature;
    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }
    public String getName() {
        return name;
    }
    public int getTemperature() {
        return temperature;
    }
}
public static void main(String[] args) {
        City city = new City("Astana", -100);
        showWeather(city);
    }

}
