/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobhseet6.Abstrak.Tugas1;

/**
 *
 * @author HP Probook 4
 */
 class Lingkaran extends Bentuk{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI*jariJari*jariJari;
    }
       
}
