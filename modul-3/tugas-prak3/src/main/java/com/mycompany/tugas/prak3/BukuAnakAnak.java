package com.mycompany.tugas.prak3;

/**
 *
 * @author MSI GAMING
 */
public class BukuAnakAnak extends Buku {
    protected String kategori;

    public BukuAnakAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
        this.kategori = "Anak-anak";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: " + kategori);
    }
}