/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosem5.pertemuan2.Tugas6;

/**
 *
 * @author HP Probook 4
 */
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
   public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
       this.kode = kode;
       this.namaBarang = namaBarang;
       this.hargaDasar = hargaDasar;
       this.diskon = diskon;
   }
   
   public int hitungHargaJual(){
       return (int) (hargaDasar - (diskon * hargaDasar));           
   }
   
   public void tampilData() {
        System.out.println("kode : " + kode);        
        System.out.println("Nama Barang : " + namaBarang);        
        System.out.println("Harga Dasar : " + hargaDasar);                
        System.out.println("Harga Dasar : " + hargaDasar);                
        System.out.println("Diskon : " + (diskon * 100) + "%");                
        System.out.println("Harga Jual " + hitungHargaJual());
   }
   
   }
