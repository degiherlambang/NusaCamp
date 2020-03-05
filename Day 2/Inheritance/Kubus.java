/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author User
 */
public class Kubus extends Persegi{
   public double volKubus(double s){
       double volKubus;
       volKubus = luasPersegi(s)*s;
       return volKubus;
   }
}
