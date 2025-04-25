package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    fun soru1(derece: Int): Double {
        val fahrenhiet = (derece * 1.8) + 32
        return fahrenhiet
    }

    fun soru2(kenar1: Int, kenar2: Int) {

        val cevre = (kenar1 + kenar2) * 2
        println("Verilen dikdortgenin cevresi: ${cevre}")
    }


    fun soru3(sayi: Int): Long {
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc = sonuc * i
        }
        return sonuc
    }

    fun soru4(kelime: String) {
        var sayac = 0
        var harfSayisi = kelime.length - 1
        for (i in 0..harfSayisi) {
            if (kelime[i] == 'a') {
                sayac++
            }
        }
        println("Girilen kelimede bulunan a harfi sayısı :${sayac}")
    }


    fun soru5(kenarSayisi: Int): Int {
        var sonuc = (kenarSayisi - 2) * 180
        return sonuc
    }

    fun soru6(gunSayisi: Int): Int {
        val saatlikUcret = 10
        val mesaiUcret = 20
        val mesaiLimiti = 160
        var kazanc = 0

        val toplamSaat = gunSayisi * 8

        if (toplamSaat <= mesaiLimiti) {
            kazanc = toplamSaat * saatlikUcret
        } else {
            val normalSaat = mesaiLimiti
            val mesaiSaat = toplamSaat - mesaiLimiti
            kazanc = (normalSaat * saatlikUcret) + (mesaiSaat * mesaiUcret)
        }
        return kazanc
    }

    fun soru7(gb: Int): Int {
        var gbLimit = 50
        var gb50Para = 100
        var odenecekTutar = 0
        if (gb <= 50) {
            odenecekTutar = gb50Para
        } else {
            odenecekTutar = gb50Para + (gb - gbLimit) * 4
        }
        return odenecekTutar
    }

}