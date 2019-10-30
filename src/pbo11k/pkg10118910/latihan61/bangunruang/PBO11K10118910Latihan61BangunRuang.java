/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan61.bangunruang;
/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menghitung bangun ruang dengan konsep abtraks
 * 
 */
public class PBO11K10118910Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        b.setR(7);
        Tabung t = new Tabung();
        t.setR(10);
        t.setT(21);
        Kerucut k = new Kerucut();
        k.setR(14);
        k.setT(9);
        String vb = String.format("%.1f", b.hitungVolume());
        String vt = String.format("%.0f", t.hitungVolume());
        String vk = String.format("%.0f", k.hitungVolume());
        System.out.println("======Program untuk menghitung Volume Bangun Ruang=====");
        System.out.println("Bola");
        System.out.println("Jari - Jari Bola : "+ b.getR()+" cm");
        System.out.println("Volume Bola : "+vb+" cm3");
        System.out.println("");
        System.out.println("Tabung");
        System.out.println("Jari - jari Tabung : "+t.getR()+" cm");
        System.out.println("Tinggi Tabung : "+t.getT()+" cm");
        System.out.println("Volume Tabung : "+vt+" cm3");
        System.out.println("");
        System.out.println("Jari - jari kerucut : "+k.getR()+" cm");
        System.out.println("Tinggi Kerucut : "+k.getT()+" cm");
        System.out.println("Volume Kerucut : "+vk+" cm3");
    }
    
}
