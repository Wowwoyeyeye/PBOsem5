package Jobhseet6.Abstrak;

public abstract class Benda {
    static int staticVariable = 0;
    int nonstaticVariable = 0;
    
    public static void staticMethod() {
        System.out.println("Ini adalah metode static di kelas Benda");
    }
    
    public void nonstaticMethod() {
        System.out.println("Ini adalah metode non-static di kelas Benda");
    }
}

class Buah extends Benda {
    String jenis;
    
    public Buah(String jenis) {
        this.jenis = jenis;
    }
    
    public void buahMethod() {
        System.out.println("Ini adalah metode spesifik kelas Buah");
    }
}

class TestBuah {
    public static void main(String[] args) {
        // Memanggil variabel dan metode dari kelas Benda
        Benda.staticVariable = 42;
        System.out.println("Variabel static dari kelas Benda: " + Benda.staticVariable);
        
        // Polimorfisme untuk merujuk ke objek kelas turunan, contohnya Buah             
        Benda benda = new Buah("Apel");
        benda.nonstaticVariable = 10; // Mengubah variabel non-static
        System.out.println("Variabel non-static dari objek Benda: " + benda.nonstaticVariable);
        
        //Memanggil metode static
        Benda.staticMethod();
        // Memanggil metode non-static
        benda.nonstaticMethod();
        
        // Memanggil metode spesifik dari kelas Buah
       Buah buah  = new Buah("Mangga");
        System.out.println("jenis buah: " + buah.jenis);
        buah.buahMethod();
        }
    }
