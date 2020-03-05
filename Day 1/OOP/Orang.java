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
class orang extends Person{

public static void main(String[] args) {

orang myCaleg = new orang();
System.out.println("---------------------------------");
        System.out.println("Input Person");
myCaleg.data();
        Scanner input = new Scanner(System.in); 
        System.out.println("---------------------------------");
        System.out.println("Hasil Output Person");
        System.out.println("" + myCaleg.nama);
        System.out.println("" + myCaleg.ttd);
        System.out.println("" + myCaleg.gender);
        System.out.println("" + myCaleg.dob);
        System.out.println("" + myCaleg.address); 
}
}