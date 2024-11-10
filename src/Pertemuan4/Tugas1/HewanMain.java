package Pertemuan4.Tugas1;

public class HewanMain {
    public static void main(String[] args) {
        // Membuat objek Herbivora
        Herbivora zebra = new Herbivora("Zebra", "Equus zebra", 5, "Rumput");
        zebra.tampilkanInfoHerbivora();
        zebra.bersuara();
        System.out.println();

        // Membuat objek Karnivora
        Karnivora singa = new Karnivora("Singa", "Panthera leo", 8, "Daging");
        singa.tampilkanInfoKarnivora();
        singa.bersuara();
        System.out.println();

        // Membuat objek Omnivora
              // Membuat objek Omnivora
        Omnivora beruang = new Omnivora("Beruang", "Ursidae", 6, "Buah dan Daging");
        beruang.tampilkanInfoOmnivora();
        beruang.bersuara();
    }
}