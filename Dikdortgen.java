/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev1;

/**
 *
 * @author DUYGU
 */
class Dikdortgen implements IAlan,ICevre {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunluk + genislik);
    }
}