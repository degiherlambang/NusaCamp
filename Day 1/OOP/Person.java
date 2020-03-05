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
class Person {
    
  public String nama; 
  public String ttd;
  public String gender; 
  public String dob;
  public String address;
  public void data() {       
      Scanner input = new Scanner(System.in); 
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("HP: ");
        ttd = input.nextLine();
        System.out.print("Gender: ");
        gender = input.nextLine();
        System.out.print("DOB: ");
        dob = input.nextLine();
        System.out.print("Address: ");
        address = input.nextLine();
        

  }
}