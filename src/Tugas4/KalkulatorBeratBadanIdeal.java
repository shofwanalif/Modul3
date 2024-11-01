package Tugas4;

import java.util.Scanner;

public class KalkulatorBeratBadanIdeal {

    public double tinggi;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KalkulatorBeratBadanIdeal kalkulator = new KalkulatorBeratBadanIdeal();

        // Input tinggi badan
        System.out.print("Masukkan tinggi badan (cm): ");
        kalkulator.tinggi = scanner.nextDouble();

        // Hitung berat badan ideal
        double beratIdeal = (kalkulator.tinggi - 100) - ((kalkulator.tinggi - 100) * 0.1);

        // Tampilkan berat badan ideal
        System.out.println("Berat badan ideal Anda adalah: " + beratIdeal + " kg");
    }
}
