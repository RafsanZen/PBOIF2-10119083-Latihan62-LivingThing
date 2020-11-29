/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan62.livingthing;

/**
 *
 * NAMA        : Rafsam Zen Mustaofa
 * KELAS       : PBOIF2
 * NIM         : 10119083
 * Deskripsi   : program living thing
 */
public class PBOIF210119083Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h = new Human();
        h.setNama("Rizki Adam Kurniawan");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
