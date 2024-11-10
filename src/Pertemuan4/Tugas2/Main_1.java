/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas2;


import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        Tabung tabung = new Tabung(jariJari, tinggi);

        System.out.println("Luas Lingkaran: " + tabung.hitungLuasLingkaran());
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
    }
}


