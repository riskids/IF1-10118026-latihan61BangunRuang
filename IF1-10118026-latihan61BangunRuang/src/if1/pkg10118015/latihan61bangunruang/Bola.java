/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan61bangunruang;

/**
 *
 * @author ACER
 */
public class Bola extends BangunRuang{
    private double jari;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return 4 * 3.14 * jari * jari * jari / 3;
    }
    
    
}
