/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas1;

/**
 *
 * @author HP Probook 4
 */
public class Herbivora extends Hewan {
    private String makananFavorit;

    // Konstruktor
    public Herbivora(String nama, String jenis, int umur, String makananFavorit) {
        super(nama, jenis, umur); // Memanggil konstruktor kelas induk
        this.makananFavorit = makananFavorit;
    }

    // Metode untuk menampilkan informasi herbivora
    public void tampilkanInfoHerbivora() {
        tampilkanInfo(); // Memanggil metode dari kelas induk
        System.out.println("Makanan Favorit: " + makananFavorit);
    }

    // Override metode bersuara untuk herbivora
    @Override
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara lembut.");
    }
}

