/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas3;

/**
 *
 * @author HP Probook 4
 */
public class Kubus extends Persegi {

    // Konstruktor
    public Kubus(double sisi) {
        super(sisi); // Memanggil konstruktor kelas induk
    }

    // Metode untuk menghitung volume kubus
    public double hitungVolume() {
        return sisi * sisi * sisi; // Volume = sisi^3
    }
}
