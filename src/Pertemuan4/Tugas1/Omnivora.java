/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas1;

/**
 *
 * @author HP Probook 4
 */
public class Omnivora extends Hewan {
    private String makananFavorit;

    // Konstruktor
    public Omnivora(String nama, String jenis, int umur, String makananFavorit) {
        super(nama, jenis, umur); // Memanggil konstruktor kelas induk
        this.makananFavorit = makananFavorit;
    }

    // Metode untuk menampilkan informasi omnivora
    public void tampilkanInfoOmnivora() {
        tampilkanInfo(); // Memanggil metode dari kelas induk
        System.out.println("Makanan Favorit: " + makananFavorit);
    }

    // Override metode bersuara untuk omnivora
    @Override
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara ceria.");
    }
}