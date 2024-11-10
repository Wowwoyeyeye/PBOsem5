/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas2;

import java.time.LocalDate;
// Dosen.java
public class Dosen extends Universitas {
    private String nidn;

    public Dosen(String nama, LocalDate tanggalLahir, String namaUniversitas, String nidn) {
        super(nama, tanggalLahir, namaUniversitas);
        this.nidn = nidn;
    }

    // Implementasi metode untuk menampilkan informasi dosen (tanpa jumlah mata kuliah)
    @Override
    public void tampilkanInformasi() {
        System.out.println("Informasi Dosen:");
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Usia Dosen: " + hitungUsia());
        System.out.println("NIDN: " + nidn);
        System.out.println("Universitas: " + namaUniversitas);
    }
}
