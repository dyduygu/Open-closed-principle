/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev1;

/**
 *
 * @author DUYGU
 */
public class Daire implements IAlan,ICevre {
    private double yaricapd;

    public Daire(double yaricapd) {
        this.yaricapd = yaricapd;
    }

        @Override
        public double alanHesapla() {
            return Math.PI*yaricapd*yaricapd;
        }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricapd;
    }
}