/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet5;

/**
 *
 * @author HP Probook 4
 */


public class SegitigaSamaKaki extends BangunDatar {
    public double alas, tinggi;
    
    public SegitigaSamaKaki(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }
    
    @Override
    public void hitungKeliling() {
        double sisiMiring = Math.sqrt((0.5 * alas) * (0.5 * alas) + (tinggi * tinggi));
        keliling = 2 * sisiMiring + alas;
    }
    
    @Override
    public void tampilData() {
        System.out.println("ALAS = " + alas);
        System.out.println("TINGGI = " + tinggi);
        super.tampilData();
        System.out.println("------------------------");
    }
}


