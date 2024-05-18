package com.mycompany.tugas_modul4;

/**
 *
 * @author MSI GAMING
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan A: ");
        double bilanganA = scanner.nextDouble();

        System.out.print("Masukkan bilangan B: ");
        double bilanganB = scanner.nextDouble();

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        int pilihan = scanner.nextInt();

        Operation operation = null;

        switch (pilihan) {
            case 1:
                operation = new Penjumlahan();
                break;
            case 2:
                operation = new Pengurangan();
                break;
            case 3:
                operation = new Perkalian();
                break;
            case 4:
                operation = new Pembagian();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        operation.setBilanganA(bilanganA);
        operation.setBilanganB(bilanganB);
        System.out.println("Hasil: " + operation.calculate());
    }
}

