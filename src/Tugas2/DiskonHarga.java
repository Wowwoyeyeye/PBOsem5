/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author HP Probook 4
 */
import java.util.Scanner;
public class DiskonHarga {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Diskon Potongan Harga ##");
        System.out.println("========================================");
             System.out.println();
    
            System.out.println("Masukan Haarga Barang");
             double hargaAsli= input.nextDouble();
       
                double diskon = hargaAsli * 0.15;
                    double hargaAkhir = hargaAsli - diskon;
        
                         System.out.println("Harga setelah diskon 15%: " + hargaAkhir);
        }
        
}
