 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author HP Probook 4
 */
public class Studen extends Person {
    public Studen()
    {
        System.out.println("Isi dari Student: Constructor");
//        beberapa kode disini 
           super.name = "someone name";
           super.address = "someone address";
    }

    @Override
    public String getName() {
        System.out.println("Student: getName baru tidak sama dengan Class person");
       return name;
    
    }

}
