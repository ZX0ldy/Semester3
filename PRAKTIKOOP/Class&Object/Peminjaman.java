public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    public double hitungHargaBayar() {
        return lamaSewa * harga;
    }

    public void tampilkanData() {
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga Sewa/Hari: " + harga);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Total Bayar   : " + hitungHargaBayar());
    }

    public static void main(String[] args) {
        Peminjaman p = new Peminjaman();
        p.id = "P001";
        p.namaMember = "Andi";
        p.namaGame = "FIFA 2024";
        p.harga = 15000;
        p.lamaSewa = 3;
        
        p.tampilkanData();
    }
}