/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas1;

/**
 *
 * @author HP Probook 4
 */
class Persegi extends Bentuk {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {            
        return sisi*sisi;
    }        
    
}
