/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        encapsulasi objek = new encapsulasi();
        objek.ModifPersegi(2, 3);
        objek.ModifSegitiga(8, 3);
        System.out.println("---   Encapsulation   ---");
        System.out.println("Luas Persegi Panjang : "+objek.getPersegi());
        System.out.println("Luas Segitiga : "+objek.getSegitiga());
    }
}
