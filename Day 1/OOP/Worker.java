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
class Worker extends Person {

public static void main(String[] args) {
String work;
String company;
String companyphone;
String position;
String npwp;

        Worker myWork = new Worker();
        System.out.println("---------------------------------");
        System.out.println("Input Worker");
        myWork.data();
        Scanner input = new Scanner(System.in); 
        System.out.print("Work Address: ");
        work = input.nextLine(); 
        System.out.print("Company: ");
        company = input.nextLine(); 
        System.out.print("CompanyPhone: ");
        companyphone = input.nextLine(); 
        System.out.print("Position: ");
        position = input.nextLine(); 
        System.out.print("NPWP: ");
        npwp = input.nextLine(); 
        System.out.println("---------------------------------");
        System.out.println("Hasil Output Pekerja");
        System.out.println("" + myWork.nama);
        System.out.println("" + myWork.ttd);
        System.out.println("" + myWork.gender);
        System.out.println("" + myWork.dob);
        System.out.println("" + myWork.address);
        System.out.println("" + work);
        System.out.println("" + company);
        System.out.println("" + companyphone);
        System.out.println("" + position);
        System.out.println("" + npwp);
    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
  }
}
