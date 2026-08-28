public class WallClock {
    // 2 Atribut
    String color;
    String shape;

    // 3 Method
    public void tick() {
        System.out.println("Wall clock sounds: Tick... Tack...");
    }

    public void changeBattery() {
        System.out.println("Wall clock battery has been replaced.");
    }

    public void displayInfo() {
        System.out.println("=== WALL CLOCK INFO ===");
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
    }
}