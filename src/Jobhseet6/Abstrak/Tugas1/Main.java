/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas1;

/**
 *
 * @author HP Probook 4
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menghitung Luas Bentuk Geometri");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.print("Pilih jenis bentuk (1/2): ");
        
        int pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = input.nextDouble();
                Bentuk persegi = new Persegi(sisi);
                System.out.printf("Luas persegi adalah: %.2f\n", persegi.hitungLuas());
                break;
                
            case 2:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                Bentuk lingkaran = new Lingkaran(jariJari);
                System.out.printf("Luas lingkaran adalah: %.2f\n", lingkaran.hitungLuas());
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        input.close();
    }
}