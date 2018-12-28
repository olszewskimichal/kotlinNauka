package matury

import java.nio.file.Files
import java.nio.file.Paths.get

fun main(args: Array<String>) {
    val lines = Files.readAllLines(get("NAPIS.TXT"))
    println(countPrimeLines(lines))
    println(countRisingNumbers3(lines))
    println(findDuplicates(lines))
}

fun findDuplicates(lines: MutableList<String>): Set<String> {
    val keys = lines
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys

    return keys
}

fun countPrimeLines(lines: MutableList<String>): Long {
    return lines.stream()
        .filter { isPrimeNumber(sumOfAsciiDigit(it)) }
        .count()
}

fun sumOfAsciiDigit(line: String): Int {
    var sum = 0
    for (c in line) {
        sum += c.toInt()
    }
    return sum
}

fun isPrimeNumber(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun countRisingNumbers3(liczby: List<String>): Long {
    return liczby.stream()
        .filter { isRising3(it) }
        .peek(System.out::println)
        .count()
}

fun isRising3(liczba: String): Boolean {
    var last = 0
    for (c in liczba) {
        if (c.toInt() <= last) return false
        last = c.toInt()
    }
    return true
}

