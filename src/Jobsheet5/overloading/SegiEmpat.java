package Jobsheet5.overloading;

public class SegiEmpat extends BangunDatar {
    public double panjang, lebar, diagonal;

    // Konstruktor dengan parameter panjang dan lebar
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Konstruktor tanpa parameter (jika memang ingin disediakan)
    public SegiEmpat() {
        // Anda bisa memberikan nilai default atau membiarkan kosong
        this.panjang = 0;
        this.lebar = 0;
    }

    // Metode hitungLuas() asli tanpa parameter
    public void hitungLuas() {
        luas = panjang * lebar;
    }

    // Metode hitungLuas() yang di-overload dengan parameter panjang dan lebar
    public void hitungLuas(double panjang, double lebar) {
        luas = panjang * lebar;
    }

    // Metode hitungKeliling() asli tanpa parameter
    @Override
    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }

    // Metode hitungKeliling() yang di-overload dengan parameter panjang dan lebar
    public void hitungKeliling(double panjang, double lebar) {
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
