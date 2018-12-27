package newIn11

fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 2 to "two")
    map.forEach { _, value -> println("$value!") }
}