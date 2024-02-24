package no3ganjil;
import java.util.Scanner;

public class No3Ganjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam masuk (1-12): ");
        int jamMasuk = scanner.nextInt();

        System.out.print("Masukkan jam keluar (1-12): ");
        int jamKeluar = scanner.nextInt();
        
        if (jamMasuk < 1 || jamMasuk > 12 || jamKeluar < 1 || jamKeluar > 12) {
            System.out.println("Jam yang dimasukkan tidak valid.");
            return;
        }

        int lamaKerja = hitungLamaKerja(jamMasuk, jamKeluar);
        System.out.println("Lama bekerja: " + lamaKerja + " jam");

        scanner.close();
    }
    
    public static int hitungLamaKerja(int jamMasuk, int jamKeluar) {
        int lamaKerja;
        if (jamMasuk <= jamKeluar) {
            lamaKerja = jamKeluar - jamMasuk;
        } else {
            lamaKerja = (12 - jamMasuk) + jamKeluar;
        }
        return lamaKerja;
    }
}
