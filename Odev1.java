/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev1;
import java.util.Scanner;

/**
 *
 * @author DUYGU
 */

public class Odev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CevreHesaplayici cevrehesaplayici=new CevreHesaplayici();
        SekilHesaplayici hesaplayici = new SekilHesaplayici();
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        double yaricapd = scanner.nextDouble();
        Daire daire = new Daire(yaricapd);
        hesaplayici.sonucuYazdir("Daire", daire);
        cevrehesaplayici.sonucuYazdir1("Daire", daire);
        
        System.out.print("Lütfen çemberin yarıçapını giriniz: ");
        double yaricap = scanner.nextDouble();
        Cember cember = new Cember(yaricap);
        cevrehesaplayici.sonucuYazdir1("Çember", cember);

        System.out.print("Lütfen dikdörtgenin uzunluğunu giriniz: ");
        double uzunluk = scanner.nextDouble();
        System.out.print("Lütfen dikdörtgenin genişliğini giriniz: ");
        double genislik = scanner.nextDouble();
        Dikdortgen dikdortgen = new Dikdortgen(uzunluk, genislik);
        hesaplayici.sonucuYazdir("Dikdörtgen", dikdortgen);
        cevrehesaplayici.sonucuYazdir1("Dikdörtgen", dikdortgen);
        
        System.out.print("Lütfen karenin kenar uzunluğunu giriniz: ");
        double kenar = scanner.nextDouble();
        Kare kare = new Kare(kenar);
        hesaplayici.sonucuYazdir("Kare", kare);
        cevrehesaplayici.sonucuYazdir1("Kare", kare);
        scanner.close();
    }
}


