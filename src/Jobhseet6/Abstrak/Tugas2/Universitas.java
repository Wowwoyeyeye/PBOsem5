/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Universitas {
    protected String nama;
    protected LocalDate tanggalLahir;
    protected String namaUniversitas;

    public Universitas(String nama, LocalDate tanggalLahir, String namaUniversitas) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.namaUniversitas = namaUniversitas;
    }

    // Metode untuk menghitung usia berdasarkan tanggal lahir
    public int hitungUsia() {
        return Period.between(tanggalLahir, LocalDate.now()).getYears();
    }

    // Metode abstrak untuk menampilkan informasi
    public abstract void tampilkanInformasi();
}
