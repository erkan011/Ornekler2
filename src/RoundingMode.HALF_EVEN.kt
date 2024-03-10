import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val value = BigDecimal("3.4")
    val roundedValue = value.setScale(0, RoundingMode.HALF_EVEN)

    println("Original value: $value")
    println("Rounded value: $roundedValue")

}