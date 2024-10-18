package pbosem5.pertemuan2;

import java.util.Scanner;

public class Tugas1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Memasukan data Mahasiswa
        System.out.print("Masukan Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Masukan Kelas : ");
        String kelas = scanner.nextLine();
        System.out.print("Masukan Nomor Induk : ");
        String nomorInduk = scanner.nextLine();

        System.out.print("Masukan Alamat : ");
        String alamat = scanner.nextLine();

        System.out.print("Masukan Nomor Hp: ");
        String nomorHp = scanner.nextLine();


        System.out.println("\nData Siswa");
        System.out.println("Nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("No induk : " + nomorInduk);
        System.out.println("Alamat : " + alamat);
        System.out.println("Nomor HP : " + nomorHp);


    }
}
