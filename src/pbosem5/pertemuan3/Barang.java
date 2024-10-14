package pbosem5.pertemuan3;

public class Barang {
  public String namaBrg;  
  public String jenisBrg;  
  public int stock;  

  public void tampilBarang() {
    System.out.println("Nama Barang  :  " + namaBrg);
    System.out.println("Jenis Barang :  " + jenisBrg);
    System.out.println("Stock Barang  : " + stock);
  }

    // Mehthod dengan argumen dan nilai balik (return)

    public  int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stock;
        return stokBaru;
    }
  
}
