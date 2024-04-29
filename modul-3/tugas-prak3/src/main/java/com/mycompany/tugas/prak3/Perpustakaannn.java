package com.mycompany.tugas.prak3;

/**
 *
 * @author MSI GAMING
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaannn {
    ArrayList<Buku> daftarBuku;

    public Perpustakaannn() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void lihatDaftarBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.info();
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaannn perpustakaannn = new Perpustakaannn();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next()+ scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.next()+ scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.next()+ scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();

            Buku buku;
            switch (kategori.toUpperCase()) {
                case "SU":
                    buku = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                case "D":
                    buku = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                case "R":
                    buku = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                case "A":
                    buku = new BukuAnakAnak(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                default:
                    buku = new Buku(judul, penulis, publisher, stok, tahunTerbit);
            }

            perpustakaannn.tambahBuku(buku);
        }

        System.out.println("\n=== Daftar Buku yang Telah Dimasukkan ===");
        perpustakaannn.lihatDaftarBuku();
    }
    }
