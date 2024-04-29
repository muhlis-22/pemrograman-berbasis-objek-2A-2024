package com.mycompany.tugas.prak3;

/**
 *
 * @author MSI GAMING
 */
public class BukuRemaja extends Buku {
    protected String kategori;

    public BukuRemaja(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
        this.kategori = "Remaja";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: " + kategori);
    }
}