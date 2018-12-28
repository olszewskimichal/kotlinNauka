package matury

import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors

fun main(args: Array<String>) {
    val liczby = Files.readAllLines(Paths.get("cyfry.txt"))
        .stream()
        .map { it.toInt() }
        .collect(Collectors.toList())
    println(countOddNumbers(liczby))
    println(maxSumOfDigits(liczby))
    println(minSumOfDigits(liczby))

    println()
    println(countRisingNumbers(liczby))
}

fun countRisingNumbers(liczby: List<Int>): Long {
    return liczby.stream()
        .filter { isRising(it) }
        .peek { println(it) }
        .count()
}

fun isRising(liczba: Int): Boolean {
    var last = 0
    for (c in liczba.toString()) {
        if (c.toInt() <= last) return false
        last = c.toInt()
    }
    return true
}

fun minSumOfDigits(liczby: List<Int>): Int {
    return liczby.stream()
        .min { o1, o2 -> sumOfDigits(o1).compareTo(sumOfDigits(o2)) }
        .orElse(0)
}

fun maxSumOfDigits(liczby: List<Int>): Int {
    return liczby.stream()
        .max { o1, o2 -> sumOfDigits(o1).compareTo(sumOfDigits(o2)) }
        .orElse(0)
}

fun countOddNumbers(liczby: List<Int>): Long {
    return liczby.stream()
        .filter { it % 2 == 0 }
        .count()
}



