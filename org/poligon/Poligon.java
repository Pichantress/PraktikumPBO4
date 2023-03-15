/**
 * File      : Poligon.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : representasi dasar dari objek poligon (segi banyak)
 * 
*/

package org.poligon;

public class Poligon{
    protected int jumlahSisi;

    public Poligon(){}

    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}