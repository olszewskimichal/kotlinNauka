package newIn11

fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 2 to "two")
// before
    println(map.mapValues { entry ->
        val (key, value) = entry
        "$key -> $value!"
    })
// now
    println(map.mapValues { (key, value) -> "$key -> $value!" })
}