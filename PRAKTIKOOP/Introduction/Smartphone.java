public class Smartphone extends Electronics {
    // 2 Atribut Khusus Smartphone
    int batteryCapacity;
    int cameraCount;

    // 3 Method (Termasuk displayInfo)
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo.");
    }

    public void makeCall() {
        System.out.println("Smartphone is making a voice call.");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== SMARTPHONE INFO ===");
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Camera Count: " + cameraCount);
    }
}