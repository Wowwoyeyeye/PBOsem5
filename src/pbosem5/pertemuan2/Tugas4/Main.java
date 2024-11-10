/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosem5.pertemuan2.Tugas4;

/**
 *
 * @author HP Probook 4
 */

import java.util.Scanner;
public class Main {   
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat objek Game
        Game game1 = new Game();
        
        // Input data game
        System.out.print("Masukkan nama game: ");
        String namaGame = input.nextLine();
        game1.setnamaGame(namaGame);
        
        System.out.print("Masukkan harga dasar game: ");
        double hargaDasar = input.nextDouble();
        game1.setHargaDasar(hargaDasar);
        
        // Menampilkan data game
        System.out.println("\nData Game:");
        System.out.println("Nama Game: " + game1.getnamaGame());
        System.out.println("Harga Dasar: " + game1.getHargaDasar());
        
        // Input data untuk transaksi peminjaman
        System.out.print("\nMasukkan ID Transaksi: ");
        int idTransaksi = input.nextInt();
        
        input.nextLine();  // Consume newline
        
        System.out.print("Masukkan nama member: ");
        String namaMember = input.nextLine();
        
        System.out.print("Masukkan lama sewa (hari): ");
        int lamaSewa = input.nextInt();
        
        System.out.print("Masukkan harga sewa per hari: ");
        double hargaSewa = input.nextDouble();
        
        // Membuat objek TransaksiPeminjaman menggunakan data dari objek Game
        TransaksiPeminjaman transaksi = new TransaksiPeminjaman(idTransaksi, namaMember, game1.getnamaGame(), lamaSewa, hargaSewa);
        
        // Menampilkan informasi transaksi
        System.out.println("\nData Transaksi Peminjaman:");
        System.out.println("ID Transaksi: " + transaksi.getIdTransaksi());
        System.out.println("Nama Member: " + transaksi.getNamaMember());
        System.out.println("Nama Game: " + transaksi.getNamaGame());
        System.out.println("Lama Sewa: " + transaksi.getLamaSewa() + " hari");
        System.out.println("Total Harga Sewa: " + transaksi.hitungTotalHarga());
        
        input.close();
    }
}

