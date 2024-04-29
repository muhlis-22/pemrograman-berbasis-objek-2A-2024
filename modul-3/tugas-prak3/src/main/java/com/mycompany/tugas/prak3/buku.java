package com.mycompany.tugas.prak3;

/**
 *
 * @author MSI GAMING
 */
import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected int stok;
    protected int tahunTerbit;

    public Buku(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
