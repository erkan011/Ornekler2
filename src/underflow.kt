fun main() {
    val x = 1.0f
    val y = 1.0e-38f
    val result = x/y
    if (result==Float.POSITIVE_INFINITY || result == Float.NEGATIVE_INFINITY){
        println("Underflow oluştu")
    }else {
        println("Sonuç: $result")
    }
}