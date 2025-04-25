package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    var s = Odev2()

    var cevap1 = s.soru1(10)   //1. soru
    println("Fahrenheit: ${cevap1}")

    s.soru2(5, 10)  //2. soru

    var cevap3 = s.soru3(5)  //3. soru
    println("Girilen sayinin faktoriyeli : ${cevap3}")


    s.soru4("masa")  //4. soru

    var cevap5 = s.soru5(4)   //5. soru
    println("Kenar sayısına göre iç açılar toplamı : ${cevap5}")


    var cevap6 = s.soru6(22) //6.soru
    println("Kazanılan para: ${cevap6}")


    var cevap7 = s.soru7(60) //6. soru
    println("Ödenecek fatura : ${cevap7}")

}