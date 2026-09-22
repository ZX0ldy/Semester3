package motorencapsulation;

public class Motorcycle {
    public int kecepatan;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off  ");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}