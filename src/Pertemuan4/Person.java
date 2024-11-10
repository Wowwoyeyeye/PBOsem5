/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author HP Probook 4
 */
public class Person {
    protected String name;    
    protected String address;    
        public Person() 
                {
                    System.out.println("Isi dari Person: Construktor"); 
                    name = "";
                    address = "";                    
                }
        public Person (String name, String address)
        {
            this.name = name; this.address = address;            
        }
        
         public String getName() {
             System.out.println("Parent: getName");
             return name;
        }

         public String getAddress() {             
            return address;
        }
         
         public void setName(String name)
         {
             this.name = name;
         }
         
         public void setAddress (String add)
         {
             this.address = add;
         }
           public void sebutIdentitas()
           {
               System.out.println("Nama: "+ name);
               System.out.println("Alamat: "+ address);
           }
}
