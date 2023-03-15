/**
 * File      : MKubus.java		15/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : driver class untuk Kubus dan Bujur Sangkar
 * 
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bs = new BujurSangkar(4.0);
        Kubus kubus = new Kubus(bs);

        System.out.println("Luas alas kubus adalah " + kubus.hitungLuasAlas());
        System.out.println("Luas Volume Kubus adalah " + kubus.hitungVolume());

    }
}
