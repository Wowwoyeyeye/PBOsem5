/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();

        System.out.print("Pilih tipe data (mahasiswa/dosen): ");
        String tipeData = scanner.nextLine().toLowerCase();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir (dd/MM/yyyy): ");
        String tanggalLahirStr = scanner.nextLine();

        // Menggunakan DateTimeFormatter untuk memformat input tanggal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

        Universitas universitas = null;

        switch (tipeData) {
            case "mahasiswa":
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                System.out.print("Masukkan Jurusan: ");
                String jurusan = scanner.nextLine();

                universitas = new Mahasiswa(nama, tanggalLahir, namaUniversitas, nim, jurusan);
                break;

            case "dosen":
                System.out.print("Masukkan NIDN: ");
                String nidn = scanner.nextLine();

                universitas = new Dosen(nama, tanggalLahir, namaUniversitas, nidn);
                break;

            default:
                System.out.println("Tipe data tidak valid!");
                scanner.close();
                return;
        }

        // Menampilkan informasi
        universitas.tampilkanInformasi();

        scanner.close();
    }
}
