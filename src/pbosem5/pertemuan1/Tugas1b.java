package pbosem5.pertemuan2;

import java.util.Scanner;
import javax.swing.*;

public class Tugas1b {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(
                null,"Masukkan Nama:",
                "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nama, " Masukan Nama Siswa",
                JOptionPane.INFORMATION_MESSAGE
        );



        String kelas = JOptionPane.showInputDialog(
              null, "Masukan Kelas:", "Input Data Siswa", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, kelas, " Masukan Kelas Siswa",
                JOptionPane.INFORMATION_MESSAGE
        );

        String nomorInduk = JOptionPane.showInputDialog(
                null, "Masukan Nomor Induk", "Input Data Siswa", JOptionPane.QUESTION_MESSAGE
        );
        JOptionPane.showMessageDialog(null, nomorInduk, " Masukan Nomor Induk Siswa",
                JOptionPane.INFORMATION_MESSAGE
        );

        String alamat = JOptionPane.showInputDialog(
                null, "Masukan Alamat:", "Input Data Siswa", JOptionPane.QUESTION_MESSAGE
        );
        JOptionPane.showMessageDialog(null, alamat, " Masukan Alamat Siswa",
                JOptionPane.INFORMATION_MESSAGE
        );

        String nomorHp = JOptionPane.showInputDialog(
                null, "Masukan Nomor Telepon:", "Input Data Siswa", JOptionPane.QUESTION_MESSAGE
        );
        JOptionPane.showMessageDialog(null, nomorHp, " Masukan NoHp Siswa",
                JOptionPane.INFORMATION_MESSAGE
        );


    }
}

