import java.math.BigDecimal

fun main() {
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
}