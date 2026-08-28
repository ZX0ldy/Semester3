public class WaterBottle {
    // 2 Atribut
    int capacity;
    String material;

    // 3 Method
    public void fillWater() {
        System.out.println("Water bottle is filled with fresh water.");
    }

    public void drink() {
        System.out.println("Drinking water from the bottle.");
    }

    public void displayInfo() {
        System.out.println("=== WATER BOTTLE INFO ===");
        System.out.println("Capacity: " + capacity + " ml");
        System.out.println("Material: " + material);
    }
}