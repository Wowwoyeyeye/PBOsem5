/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas1;

/**
 *
 * @author HP Probook 4
 */
public class Hewan {
     String nama;
    private String jenis;
    private int umur;

    // Konstruktor
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Umur: " + umur + " tahun");
    }

    // Metode untuk menggambarkan hewan bersuara
    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }
}


