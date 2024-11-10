package pbosem5.pertemuan3.Tugas1;

import java.util.Scanner;
public class NilaiTerbesar {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);    
        System.out.println("Silahkan Menginputkan Bilangan: ");
       
        System.out.println("Silahkan Masukan Bilangan Pertama");
        byte nilai1 = (byte) input.nextInt();
        System.out.println("Silahkan Masukan Bilangan Kedua ");
        byte nilai2 = (byte) input.nextInt();
        System.out.println("Silahkan Masukan Bilangan Ketiga");
        byte nilai3 = (byte) input.nextInt();
        
        byte terbesar = nilai1;
        
        if (nilai2 > terbesar) {
            terbesar = nilai2;
        } 
        if(nilai3 > terbesar) {
            terbesar = nilai3;
        }
         
         System.out.println("Nilai Terbesar adalah :" + terbesar);
    }   
}

