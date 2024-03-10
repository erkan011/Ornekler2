@file:Suppress("INTEGER_OVERFLOW")

fun main() {
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
}