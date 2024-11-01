package Tugas3;
public class TiketPesawat extends Pemesanan implements Tugas3.Tiket {
    private String nama;
    private String asal;
    private String tujuan;
    private double Tiket;
    private double diskon;

    public TiketPesawat(info info) {
        this.nama = info.nama();
        this.asal = info.asal();
        this.tujuan = info.tujuan();
        this.Tiket = info.hargatiket();
        this.diskon = info.diskon();
    }

    @Override
    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }

    @Override
    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}

