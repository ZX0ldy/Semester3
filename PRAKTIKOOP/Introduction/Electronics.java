public class Electronics {
    String brand;
    int powerConsumption;

    public void turnOn() {
        System.out.println("Electronic device is turned ON.");
    }

    public void turnOff() {
        System.out.println("Electronic device is turned OFF.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption + " Watts");
    }
}