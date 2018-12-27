package newIn11

import java.io.File

fun main(args: Array<String>) {
    //String to number conversions
    val port = System.getenv("PORT")?.toIntOrNull() ?: 80
    println(port)

    //onEach()
    File(".").walk()
        .onEach { println("OnEach $it") }
        .filter { it.isFile && it.name.endsWith(".txt") }
        .forEach { println("forEach $it") }

    //groupingBY
    val words = "one two three four five six seven eight nine ten".split(' ')
    val frequencies = words.groupingBy { it.first() }.eachCount()
    println("Counting first letters: $frequencies.")

    //Map.minus(key)
    val map = mapOf("key" to 42)
    val emptyMap = map - "key"
    println(emptyMap)

    //minOf and maxOf
    val list1 = listOf("a", "b")
    val list2 = listOf("x", "y", "z")
    val minSize = minOf(list1.size, list2.size)
    val longestList = maxOf(list1, list2, compareBy { it.size })
    println(minSize)
    println(longestList)

    //Array-like List instantiation functions
    val squares = List(10) { index -> index * index }
    val mutable = MutableList(10) { 0 }
    println("$squares $mutable")
}
