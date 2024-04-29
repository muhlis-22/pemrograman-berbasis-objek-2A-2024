package com.mycompany.tugas.prak3;

/**
 *
 * @author MSI GAMING
 */
public class BukuDewasa  extends Buku{
    protected String kategori;

    public BukuDewasa(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
        this.kategori = "Dewasa";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: " + kategori);
    }
}