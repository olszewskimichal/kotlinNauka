package matury

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val lines = Files.readAllLines(Paths.get("dane.txt"))
    println(countLinesWIthTheSameFirstLetterAndLastLetter(lines))
    println(countLinesWIthTheSameFirstLetterAndLastLetterInDecimal(lines))
    println()
    println(countRisingNumbers2(lines))
    lines.stream()
        .filter { isRising2(it) }
        .map { it.toInt() }
        .max { o1, o2 -> o1.compareTo(o2) }
        .ifPresent(System.out::println)
    lines.stream()
        .filter { isRising2(it) }
        .map { it.toInt() }
        .min { o1, o2 -> o1.compareTo(o2) }
        .ifPresent(System.out::println)
}

fun countLinesWIthTheSameFirstLetterAndLastLetterInDecimal(lines: MutableList<String>): Long {
    return lines.stream()
        .filter { firstLetterEqualsLastLetter(convertToDecFromOct(it)) }
        .count()
}

fun countLinesWIthTheSameFirstLetterAndLastLetter(lines: MutableList<String>): Long {
    return lines.stream()
        .filter { firstLetterEqualsLastLetter(it) }
        .count()
}

fun firstLetterEqualsLastLetter(line: String): Boolean {
    return line[0] == line[line.length - 1]
}

fun convertToDecFromOct(line: String): String {
    return Integer.parseInt(line, 8).toString()
}

fun countRisingNumbers2(liczby: List<String>): Long {
    return liczby.stream()
        .filter { isRising2(it) }
        .count()
}

fun isRising2(liczba: String): Boolean {
    var last = 0
    for (c in liczba) {
        if (c.toInt() < last) return false
        last = c.toInt()
    }
    return true
}