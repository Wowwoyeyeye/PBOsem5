/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Tugas2;

public class LuasLingkaran {
    protected double jariJari;

    public LuasLingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double hitungLuasLingkaran() {
        return Math.PI * jariJari * jariJari;
    }
}

