public class Barang4 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : Rp " + hitungHargaJual());
    }

    public static void main(String[] args) {
        Barang4 b = new Barang4();
        b.kode = "B001";
        b.namaBarang = "Sepatu";
        b.hargaDasar = 200000;
        b.diskon = 10;

        b.tampilData();
    }
}
