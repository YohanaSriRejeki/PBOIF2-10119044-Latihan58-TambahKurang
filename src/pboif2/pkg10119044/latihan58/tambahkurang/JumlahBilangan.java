/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan58.tambahkurang;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil tambah kurang bilangan
 */
public class JumlahBilangan extends Bilangan {
    
    public void tampilHasilJumlah(){
        int penjumlahan;
        penjumlahan = getX()+getY();
        System.out.println("Hasil penjumlahan : "+penjumlahan);
    }
}
