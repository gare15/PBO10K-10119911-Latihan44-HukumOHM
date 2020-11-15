/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911latihan44;

/**
 *
 * @author 
 * Nama : Mochamad Tegar
 * NIM : 10119911
 * Kelas : IF 10K
 */
public class PBO10119911Latihan44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai energy = new Baterai(3,12);


        System.out.println("Kuat Arus\t\t: "+energy.getKuatArus());
        System.out.println("Hambatan\t\t: "+energy.getHambatan());
        System.out.println("Hasil Tegangan\t: "+energy.hitunTegangan());
    }
    
}
