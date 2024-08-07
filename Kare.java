/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev1;

class Kare implements IAlan,ICevre {
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return Math.pow(kenar, 2);
    }

    @Override
    public double cevreHesapla() {
        return 4 * kenar;
    }
}
