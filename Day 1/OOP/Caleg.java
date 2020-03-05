/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author User
 */
class caleg extends Person {

public static void main(String[] args) {
String partai;
String nourut;
String dapil;
String keluarga;

caleg myCaleg = new caleg();
System.out.println("---------------------------------");
        System.out.println("Input Caleg");
        myCaleg.data();
        Scanner input = new Scanner(System.in); 
        System.out.print("Partai: ");
        partai = input.nextLine(); 
        System.out.print("No Urut: ");
        nourut = input.nextLine(); 
        System.out.print("Dapil: ");
        dapil = input.nextLine(); 
        System.out.print("Keluarga: ");
        keluarga = input.nextLine();  
        System.out.println("---------------------------------");
        System.out.println("Hasil Output CALEG");
        System.out.println("" + myCaleg.nama);
        System.out.println("" + myCaleg.ttd);
        System.out.println("" + myCaleg.gender);
        System.out.println("" + myCaleg.dob);
        System.out.println("" + myCaleg.address);
        System.out.println("" + partai);
        System.out.println("" + nourut);
        System.out.println("" + dapil);
        System.out.println("" + keluarga);
    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
  }
}
