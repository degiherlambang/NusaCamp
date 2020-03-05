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
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class BangunRuang {
    public static void main(String[] args) {
        
        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("1.Persegi Panjang & Balok; 2.Persegi & Kubus"));
        switch (pilihan){
       
                case 1:
                    double p,t,l,t2,luaspp,volumeb;
                    p = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Panjang: "));
                    l = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Lebar: "));
                    t = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi: "));
                    
                    PersegiPanjang PP = new PersegiPanjang();
                    Balok B = new Balok();
                    
                    luaspp = PP.luasPersegiPanjang(p, l);
                    JOptionPane.showMessageDialog(null,"Luas Persegi Panjang adalah: "+luaspp);
                    
                    volumeb = B.VolBalok(p, l, t);
                    JOptionPane.showMessageDialog(null,"Volume Balok adalah: "+volumeb);
                    break;
                    
                case 2: 
                    double s,luasPersegi,volKubus;
                    s = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Sisi: "));
                    
                    Persegi P = new Persegi();
                    Kubus K = new Kubus();
                    
                    luasPersegi = P.luasPersegi(s);
                    JOptionPane.showMessageDialog(null,"Luas Persegi adalah: "+luasPersegi);
                    
                    volKubus = K.volKubus(s);
                    JOptionPane.showMessageDialog(null,"Volume Kubus adalah: "+volKubus);
        }
    
    }
}