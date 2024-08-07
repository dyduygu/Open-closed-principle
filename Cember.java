/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev1;

/**
 *
 * @author DUYGU
 */
class Cember implements ICevre {
    private double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }
  
    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
}