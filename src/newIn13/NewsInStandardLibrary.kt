package newIn13

import kotlin.random.Random

//Parameterless main
fun main() {
    println("Hello, world!")

    //Multiplatform Random
    val number = Random.nextInt(42)  // number is in range [0, limit)
    println(number)

    printAllUppercase(listOf("foo", "Bar"))
    printAllUppercase(listOf("FOO", "BAR"))}


//ifEmpty and ifBlank functions
fun printAllUppercase(data: List<String>) {
    val result = data
        .filter { it.all { c -> c.isUpperCase() } }
        .ifEmpty { listOf("<no uppercase>") }
    result.forEach { println(it) }
}