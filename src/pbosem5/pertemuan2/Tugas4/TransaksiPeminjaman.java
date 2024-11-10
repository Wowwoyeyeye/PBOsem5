package pbosem5.pertemuan2.Tugas4;

public class TransaksiPeminjaman {
    private int idTransaksi;
    public String namaMember;    
    public String namaGame;
    public int lamaSewa;
    public double hargaSewa;

    // Constructor dengan inisialisasi untuk semua variabel
    public TransaksiPeminjaman(int idTransaksi, String namaMember, String namaGame, int lamaSewa, double hargaSewa) {
        this.idTransaksi = idTransaksi;
        this.namaMember = namaMember;
        this.namaGame = namaGame; // Properti ini sekarang diinisialisasi
        this.lamaSewa = lamaSewa;
        this.hargaSewa = hargaSewa;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public String getNamaGame() {
        return namaGame;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double hitungTotalHarga() {
        return lamaSewa * hargaSewa;
    }
}
