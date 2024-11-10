/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas2;

/**
 *
 * @author HP Probook 4
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        Tabung tabung = new Tabung(jariJari, tinggi);

        double luasPermukaan = tabung.hitungLuasPermukaan();
        double volume = tabung.hitungVolume();

        System.out.println("Luas Permukaan Tabung: " + luasPermukaan);
        System.out.println("Volume Tabung: " + volume);
    }
}

