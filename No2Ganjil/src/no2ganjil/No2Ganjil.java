package no2ganjil;

import java.util.Scanner;

public class No2Ganjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi 1: ");
        double sisi1 = scanner.nextDouble();
        System.out.println("Masukkan panjang sisi 2: ");
        double sisi2 = scanner.nextDouble();
        System.out.println("Masukkan panjang sisi 3: ");
        double sisi3 = scanner.nextDouble();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
