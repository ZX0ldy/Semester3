public class Lingkaran {
    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.r = 7;

        System.out.println("Jari-jari : " + l.r);
        System.out.println("Luas      : " + l.hitungLuas());
        System.out.println("Keliling  : " + l.hitungKeliling());
    }
}