import java.math.BigInteger

fun main() {
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

    //

}