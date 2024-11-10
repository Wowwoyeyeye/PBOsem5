package Jobsheet5.overloading;


import Jobsheet5.overloading.Lingkaran;
import Jobsheet5.overloading.SegiEmpat;
import Jobsheet5.overloading.SegitigaSamaKaki;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dan menetapkan nilai jariJari
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 14.0; // Memberikan nilai jari-jari
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilData();
        
        System.out.println("------------------------");

        // Membuat objek SegitigaSamaKaki dan menetapkan nilai alas dan tinggi
        SegitigaSamaKaki segitiga = new SegitigaSamaKaki();
        segitiga.alas = 8.0; // Memberikan nilai alas
        segitiga.tinggi = 3.0; // Memberikan nilai tinggi
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        segitiga.tampilData();
        
        System.out.println("------------------------");

        // Membuat objek SegiEmpat dan menetapkan nilai panjang dan lebar
        SegiEmpat persegiPanjang = new SegiEmpat();
        persegiPanjang.panjang = 5.0; // Memberikan nilai panjang
        persegiPanjang.lebar = 8.0; // Memberikan nilai lebar
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        persegiPanjang.hitungDiagonal();
        persegiPanjang.tampilData();
    }
}
