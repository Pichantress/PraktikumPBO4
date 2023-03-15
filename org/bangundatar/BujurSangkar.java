/**
 * File      : Bujur Sangkar.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : representasi dasar dari objek bujur sangkar,turunan kelas poligon
 * 
*/

package org.bangundatar;

import org.poligon.*;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4 ;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return jumlahSisi * panjangSisi;
    }


}
