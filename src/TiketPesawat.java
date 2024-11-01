import java.info;

public class TiketPesawat extends Pemesanan implements Tiket {
    private String nama;
    private String tujuan;
    private String dst;
    private double Tiket;
    private double diskon;

    public TiketPesawat(String nama, String asal, String tujuan, double hargatiket, info info) {
        this.nama = nama;
        this.tujuan = asal;
        this.dst = tujuan;
        this.Tiket = hargatiket;
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
        System.out.println("Asal: " + tujuan);
        System.out.println("Tujuan: " + dst);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}

