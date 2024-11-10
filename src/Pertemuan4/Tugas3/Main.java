/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas3;

/**
 *
 * @author HP Probook 4
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mengambil input dari pengguna
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // Membuat objek Kubus
        Kubus kubus = new Kubus(sisi);

        // Menghitung dan menampilkan volume kubus
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        // Menutup scanner
        scanner.close();
    }
}