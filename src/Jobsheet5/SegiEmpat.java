/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet5;

/**
 *
 * @author HP Probook 4
 */
public class SegiEmpat extends BangunDatar {
    public double panjang, lebar, diagonal;
    
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
    }
    
    @Override
    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
    
    public void hitungDiagonal() {
        diagonal = Math.sqrt((panjang * panjang) + (lebar * lebar));
    }
    
    @Override
    public void tampilData() {
        System.out.println("PANJANG = " + panjang);
        System.out.println("LEBAR = " + lebar);
        System.out.println("DIAGONAL = " + diagonal);
        super.tampilData();
        System.out.println("------------------------");
    }
}
