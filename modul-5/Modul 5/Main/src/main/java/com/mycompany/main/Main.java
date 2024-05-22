package com.mycompany.main;

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

        System.out.print("Masukkan bilangan C: ");
        double bilanganC = scanner.nextDouble();

        // Array untuk menyimpan objek-objek operasi
        Operation[] operations = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        // Melakukan operasi dengan bilangan A dan B
        for (Operation operation : operations) {
            operation.setBilangan1(bilanganA);
            operation.setBilangan2(bilanganB);
            System.out.println("Hasil " + operation.getClass().getSimpleName() + " A dan B: " + operation.calculate());
        }

        // Melakukan operasi dengan bilangan A, B, dan C menggunakan metode overloading
        for (Operation operation : operations) {
            operation.setBilangan1(bilanganA);
            operation.setBilangan2(bilanganB);
            operation.setBilangan3(bilanganC);
            System.out.println("Hasil " + operation.getClass().getSimpleName() + " A, B dan C: " + operation.calculate(operation.getBilangan1(), operation.getBilangan2()));
        }

        scanner.close();
    }
}