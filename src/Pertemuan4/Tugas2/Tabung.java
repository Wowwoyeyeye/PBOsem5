/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas2;

public class Tabung extends LuasLingkaran {
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}

