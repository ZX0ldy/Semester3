public class Laptop extends Electronics {
    int ram;
    String processor;

    public void openApp() {
        System.out.println("Laptop is opening the Java IDE application.");
    }

    public void code() {
        System.out.println("Laptop is currently being used for programming.");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== LAPTOP INFO ===");
        super.displayInfo();
        System.out.println("RAM Capacity: " + ram + " GB");
        System.out.println("Processor: " + processor);
    }
}