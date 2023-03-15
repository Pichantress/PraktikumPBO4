/**
 * File      :  Kubus.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : representasi dasar dari objek kubus
 * 
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{

    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungLuasAlas(){
        return this.permukaan.hitungLuas();
    }

    public double hitungVolume(){
        return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
    }


}
