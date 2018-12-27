package newIn12

import java.math.BigDecimal
import kotlin.math.E
import kotlin.math.PI
import kotlin.math.max

fun main(args: Array<String>) {
    //fill, replaceAll, shuffle/shuffled

    val items = (1..5).toMutableList()

    items.shuffle()
    println("Shuffled items: $items")

    items.replaceAll { it * 2 }
    println("Items doubled: $items")

    items.fill(5)
    println("Items filled with 5: $items")

    //Operators and conversions for BigInteger and BigDecimal
    val value = 66
    val bigDecimal = value.toBigDecimal()
    val one = BigDecimal.ONE
    val result = bigDecimal + one
    println(result)

    //Math operations in kotlin-stdlib
    println(PI)
    println(E)
    println(max(1,2))
}
