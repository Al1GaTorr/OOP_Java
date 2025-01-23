package Assignment3_2;

public class Task5 {
    public static class Building {

    private String type;
    public Building(String type) {
        this.type = type;
    }
    public void initialize(String type){
        System.out.println("Type of building: " + type);
    }
    public static void main(String[] args) {
        Building building = new Building("Ресторан");
        building.initialize("Барбершоп");
        }
    }
}
