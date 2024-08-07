/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev1;

/**
 *
 * @author DUYGU
 */

class SekilHesaplayici {
    public void sonucuYazdir(String sekilAdi, IAlan sekil) {
        System.out.println(sekilAdi + " Alanı: " + sekil.alanHesapla());
      
        System.out.println();
    }
}
class CevreHesaplayici {
    public void sonucuYazdir1(String sekilAdi, ICevre sekil2) {
      
        System.out.println(sekilAdi + " Çevresi: " + sekil2.cevreHesapla());
        System.out.println();
    }
}
