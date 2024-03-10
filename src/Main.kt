@file:Suppress("INTEGER_OVERFLOW")

import java.math.BigInteger
import java.math.BigDecimal
import java.math.RoundingMode
fun main() {





    //underflow

    val x = 1.0f
    val y = 1.0e-38f
    val result = x/y
    if (result==Float.POSITIVE_INFINITY || result == Float.NEGATIVE_INFINITY){
        println("Underflow oluştu")
    }else {
        println("Sonuç: $result")
    }

    //





    //Overflow
    val a: Int = Int.MAX_VALUE
    val b = 1
    // Taşma kontrolü ile toplama işlemi
    val sum1: Int = if (a > Int.MAX_VALUE - b) {
        Int.MAX_VALUE // Taşma durumunda maksimum değeri ata
    } else {
        a + b
    }
    println("Toplam: $sum1")

    //




    //RoundingMode.HALF_EVEN
    val number = BigDecimal("1555255.555")

    val roundedNumber = number.setScale(2, RoundingMode.HALF_EVEN)
    val formattedNumber = String.format("%,.2f", roundedNumber)
    println("Yuvarlanmış Sayı: $formattedNumber")


    //BigDecimal
    //Big decimal nesneleri oluşturma
    val number1 = BigDecimal("10.25")
    val number2 = BigDecimal("20.50")

    //Toplama işlemi
    val resultAdd1 = number1.add(number2)
    println("Toplam: $resultAdd1")

    //Çıkarma işlemi
    val resultSubtract = number2.subtract(number1)
    println("Çıkarama: $resultSubtract")

    //Çarpma işlemi
    val resultMultiply1 = number1.multiply(number2)
    println("Çarpma: $resultMultiply1")

    //Bölme işlemi
    val resultDivide = number2.divide(number1)
    println("Bölme: $resultDivide")


    //





    //BigInteger
    //İki büyük tamsayı oluşturma
    val bigInteger1 = BigInteger("123456789012345678901234567890")
    val bigInteger2 = BigInteger("987654321098765432109876543210")

    //Toplama İşlemi
    val resultAdd = bigInteger1.add(bigInteger2)
    println("Toplam: $resultAdd")

    //Çarpma İşlemi
    val resultMultiply = bigInteger1.multiply(bigInteger2)
    println("Çarpım: $resultMultiply")

    //Güç Hesaplama
    val resultPow = bigInteger1.pow(3)
    println("Üs: $resultPow")

    //Karşılaştırma işlemi
    val comparison = bigInteger1.compareTo(bigInteger2)
    when {
        comparison < 0 -> println("bigInteger1, bigInteger2'den küçüktür.")
        comparison > 0 -> println("bigInteger1, bigInteger2'den büyüktür.")
        else -> println("bigInteger1 ve bigInteger2 eşittir")
    }

    //





    //non-Nullable

    val userName = "Erkan" //Non-nullable olarak tanımlanmış bir kullanıcı adı
    println("Username: $userName")

    //




    //defaultValue

    val userAge: Int? =null // Kullanıcının yaşını temsil eden nullable bir değişken
    val defaultAge = 18 // Varsayılan yaş değeri
    val age = userAge ?: defaultAge // userAge değeri null ise defaultAge değerini kullan
    println("User Age: $age")

    //




    //Single Precision

    val num1 = 3.5f
    val num2 = 2.8f
    val sum: Float = num1 + num2

    println("Toplam: $sum")

    //



    //Max ve Min değer

    println("Int veri tipinin maksimum değeri: ${Int.MAX_VALUE}")
    println("Int veri tipinin minimum değeri: ${Int.MIN_VALUE}")

    //
}