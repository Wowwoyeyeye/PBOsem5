package Jobsheet5.overloading;

public class Lingkaran extends BangunDatar {
    public double jariJari;       

    // Constructor default
    public Lingkaran() {
        this.jariJari = 0;
    }
    
    // Constructor dengan parameter integer
    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }
    
    // Constructor dengan parameter double
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public void hitungLuas() {
        luas = 3.14 * jariJari * jariJari;
    }
    
    public void hitungLuas(double jariJari){
        this.jariJari = jariJari;
        luas = 2*3.14*jariJari;
    }
    
    @Override
    public void hitungKeliling() {
        keliling = 2 * 3.14 * jariJari;
    }
    
    public void hitungKeliling(double jariJari){
        this.jariJari = jariJari;
        keliling = 2*3.14*jariJari;
    }
    
    @Override
    public void tampilData() {
        System.out.println("JARI-JARI = " + jariJari);
        super.tampilData();
        System.out.println("------------------------");
    }
}