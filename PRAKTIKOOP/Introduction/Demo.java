public class Demo {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.brand = "Asus ROG";
        myLaptop.powerConsumption = 150;
        myLaptop.ram = 16;
        myLaptop.processor = "Intel Core i7";

        Smartphone myPhone = new Smartphone();
        myPhone.brand = "Samsung";
        myPhone.powerConsumption = 25;
        myPhone.batteryCapacity = 5000;
        myPhone.cameraCount = 3;

        WallClock roomClock = new WallClock();
        roomClock.color = "Black";
        roomClock.shape = "Circle";

        WaterBottle deskBottle = new WaterBottle();
        deskBottle.capacity = 800;
        deskBottle.material = "Stainless Steel";

        myLaptop.displayInfo();
        myLaptop.turnOn();
        myLaptop.openApp();
        myLaptop.code();
        myLaptop.turnOff();
        System.out.println();

        myPhone.displayInfo();
        myPhone.turnOn();
        myPhone.takePhoto();
        myPhone.makeCall();
        myPhone.turnOff();
        System.out.println();

        roomClock.displayInfo();
        roomClock.changeBattery();
        roomClock.tick();
        System.out.println();

        deskBottle.displayInfo();
        deskBottle.fillWater();
        deskBottle.drink();
    }
}