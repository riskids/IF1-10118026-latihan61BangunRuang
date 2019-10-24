/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan61bangunruang;

import java.text.DecimalFormat;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program    : Program ini berisi program Menghitung volume bangun ruang
 */
public class IF110118015Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Bola bolabasket = new Bola();
        bolabasket.setJari(7);
        System.out.println("=========Hitung Volume Bola=========");
        System.out.println("jari - jari Bola : " + bolabasket.getJari());
        System.out.println("volume Bola \t : " + df.format(bolabasket.hitungVolume()));
        System.out.println();
        
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);
        System.out.println("=========Hitung Volume Tabung=========");
        System.out.println("jari - jari tabung : " + tabung.getJari());
        System.out.println("Tinggi tabung \t: " + tabung.getTinggi());
        System.out.println("volume tabung \t : " + df.format(tabung.hitungVolume()));
        System.out.println();
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("=========Hitung Volume Kerucut=========");
        System.out.println("jari - jari Kerucut : " + kerucut.getJari());
        System.out.println("Tinggi tabung \t: " + kerucut.getTinggi());
        System.out.println("volume tabung \t : " + df.format(kerucut.hitungVolume()));
        System.out.println();
    }
    
}
