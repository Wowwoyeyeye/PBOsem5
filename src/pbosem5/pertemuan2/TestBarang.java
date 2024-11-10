package pbosem5.pertemuan2;

public class TestBarang {
  public static void main(String[] args) {
    Barang brng1 = new Barang();  

    brng1.namaBrg = "pensil";
    brng1.jenisBrg = "ATK";
    brng1.stock = 10;
    brng1.tampilBarang();
    System.out.println("Stok Baru adalah " + brng1.tambahStok(20));
    System.out.println("Stok Baru adalah " + brng1.tambahStok(20));
    
  }
}
