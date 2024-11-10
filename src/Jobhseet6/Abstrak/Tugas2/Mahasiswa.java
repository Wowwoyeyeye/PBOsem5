/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas2;

import java.time.LocalDate;

/**
 *
 * @author HP Probook 4
 */
class Mahasiswa extends Universitas {
     private String nim;
    private String jurusan;

    public Mahasiswa(String nama, LocalDate tanggalLahir, String namaUniversitas, String nim, String jurusan) {
        super(nama, tanggalLahir, namaUniversitas);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Implementasi metode untuk menampilkan informasi mahasiswa
    @Override
    public void tampilkanInformasi() {
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Usia Mahasiswa: " + hitungUsia());
        System.out.println("Jurusan Mahasiswa: " + jurusan);
        System.out.println("NIM: " + nim);
        System.out.println("Universitas: " + namaUniversitas);
    }
}