/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas3;

/**
 *
 * @author HP Probook 4
 */
public class Persegi {
    protected double sisi;

    // Konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi; // Menginisialisasi sisi persegi
    }

    // Metode untuk menghitung luas persegi
    public double hitungLuas() {
        return sisi * sisi; // Luas = sisi^2
    }
}