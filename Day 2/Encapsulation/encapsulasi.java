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
public class encapsulasi {

private int panjang;
private int lebar;
private int alas;
private int tinggi;

public int getPersegi(){
return this.panjang*lebar;
}

public int getSegitiga(){
return this.alas*tinggi/2; 
}
public void ModifPersegi(int panjang, int lebar){
this.panjang=panjang;
this.lebar=lebar;
}
public void ModifSegitiga(int alas, int tinggi){
this.alas=alas;
this.tinggi=tinggi;
}
}