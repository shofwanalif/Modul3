package Tugas4;

import java.util.Scanner;

public class KalkulatorBeratBadanIdealRef {

    /** Konstanta pengurangan tinggi badan*/
    private static final double PENGURANG_TINGGI = 100;

    /** Konstanta pengurangan persentase berat badan ideal*/
    private static final double PERSENTASE_PENGURANGAN = 0.1;

    /** tinggi badan pengguna dalam Cm*/
    private double tinggiBadan;

    /**
     * Mengambil tinggi badan pengguna
     * @return tinggiBadan dalam cm
     **/
    public double getTinggiBadan() {
        return tinggiBadan;
    }

    /**
     * Mengatur tinggi badan pengguna
     * @param tinggiBadan dalam cm
     **/
    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    /**
     *Inisialisai objek kalkulator dari class KalkulatorBeratBadanIdealRef
     * Mengambil input tinggi badan
     * Menghitung berat badan ideal dan menampilkan hasil
     **/
    public static void main(String[] args) {
        KalkulatorBeratBadanIdealRef kalkulator = new KalkulatorBeratBadanIdealRef();
        kalkulator.inputTinggiBadan();
        double beratIdeal = kalkulator.hitungBeratIdeal();
        kalkulator.tampilkanBeratIdeal(beratIdeal);
    }

    /**
     *Mengambil input tinggi badan
     *Scanner untuk menampung input dari pengguna
     **/
    private void inputTinggiBadan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan (cm): ");
        setTinggiBadan(scanner.nextDouble());
    }

    /**
     * Menghitung berat badan ideal berdasarkan tinggi
     * @return berat ideal dalam kg
     **/
    private double hitungBeratIdeal() {
        return (getTinggiBadan() - PENGURANG_TINGGI) - ((getTinggiBadan() - PENGURANG_TINGGI) * PERSENTASE_PENGURANGAN);
    }

    /**
     * Menampilkan berat badan ideal
     * @param beratIdeal dalam kg
     **/
    private void tampilkanBeratIdeal(double beratIdeal) {
        System.out.println("Berat badan ideal Anda adalah: " + beratIdeal + " kg");
        System.out.println("ayo olahraga");
    }
}
