package no1ganjil;

import java.util.Scanner;

public class No1Ganjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tiga karakter: ");
        String input = scanner.nextLine();

        if (input.length() == 3) {
            char char1 = input.charAt(0);
            char char2 = input.charAt(1);
            char char3 = input.charAt(2);

            if (isConsonant(char1) && isVowel(char2) && isConsonant(char3)) {
                System.out.println("Urutan konsonan-vokal-konsonan");
            } else {
                System.out.println("Bukan urutan konsonan-vokal-konsonan");
            }
        } else {
            System.out.println("Masukan harus terdiri dari tiga karakter.");
        }
    }

    public static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
