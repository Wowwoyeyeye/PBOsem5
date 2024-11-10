package pbosem5.pertemuan2;

public class TampilMahasiswa {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nim = 101;    
    mhs1.nama = "Dwi Bagus Anggoro";    
    mhs1.alamat = "Desa Bumiharjo Kecamatan Klirong Kabupaten Kebumen";    
    mhs1.kelas = "5A";    
    mhs1.tampilBiodata();  
    System.out.println(" \n");

    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nim = 102;    
    mhs2.nama = "Muhammad Jaelani";    
    mhs2.alamat = "Desa Giwangretno Kecamatan Sruweng Kabupaten Kebumen";    
    mhs2.kelas = "2A";    
    mhs2.tampilBiodata(); 
    System.out.println(" \n");

    Mahasiswa mhs3 = new Mahasiswa();
    mhs3.nim = 103;    
    mhs3.nama = "Muhammad Arifin";    
    mhs3.alamat = "Desa Panjer Kecamatan Kebumen Kabupaten Kebumen";    
    mhs3.kelas = "3A";    
    mhs3.tampilBiodata();    
  }
}