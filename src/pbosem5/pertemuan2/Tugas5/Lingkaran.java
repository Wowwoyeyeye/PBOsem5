/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosem5.pertemuan2.Tugas5;

/**
 *
 * @author HP Probook 4
 */
public class Lingkaran {
    public double phi;
    public double r;
    
    public Lingkaran(double r) {
        this.phi = Math.PI;
        this.r = r;
    }    
    
    public double hitungLuas() {
        return phi * r * r;
    }
    
    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
