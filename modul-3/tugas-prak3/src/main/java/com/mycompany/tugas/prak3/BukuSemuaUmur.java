package com.mycompany.tugas.prak3;

/**
 *
 * @author MSI GAMING
 */
public class BukuSemuaUmur extends Buku {
    protected String kategori;

    public BukuSemuaUmur(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
        this.kategori = "Semua Umur";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: " + kategori);
    }
}
