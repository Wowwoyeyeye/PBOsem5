package Jobsheet5;

public class Lingkaran extends BangunDatar {
    public double jariJari;
    
    // Constructor default
    public Lingkaran() {
        super(); // Memanggil constructor dari parent class (BangunDatar)
        this.jariJari = 0;
    }
    
    // Constructor dengan parameter double
    public Lingkaran(double jariJari) {
        super(); // Memanggil constructor dari parent class (BangunDatar)
        this.jariJari = jariJari;
    }
    
    // Constructor dengan parameter int
    public Lingkaran(int jariJari) {
        super(); // Memanggil constructor dari parent class (BangunDatar)
        this.jariJari = (double) jariJari;
    }
    
    @Override
    public void hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
    }
    
    @Override
    public void hitungKeliling() {
        keliling = 2 * Math.PI * jariJari;
    }
    
    @Override
    public void tampilData() {
        System.out.println("JARI-JARI = " + jariJari);
        super.tampilData();
        System.out.println("------------------------");
    }
}