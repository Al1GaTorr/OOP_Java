package Assignment3_2_Task15;

public class Earth {
    public static void main(String[] args) {
    Africa africa = new Africa(30370000);
    Antarctica antarctica = new Antarctica(14000000);
    Australia australia = new Australia(8600000);
    Eurasia eurasia = new Eurasia(55000000);
    NorthAmerica northAmerica = new NorthAmerica(24709000);
    SouthAmerica southAmerica = new SouthAmerica(17840000);

    System.out.println("Africa area: " + africa.getArea());
    System.out.println("Antarctica area: " + antarctica.getArea());
    System.out.println("Australia area: " + australia.getArea());
    System.out.println("Eurasia area: " + eurasia.getArea());
    System.out.println("North America area: " + northAmerica.getArea());
    System.out.println("South America area: " + southAmerica.getArea());
}
}
