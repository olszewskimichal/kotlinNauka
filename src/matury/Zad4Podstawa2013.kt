package matury

import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val lines = Files.readAllLines(Paths.get("napisy.txt"))
    println(countOddLines(lines))
    println(countWithTheSameCountOfElements(lines))
    println(countWithOnlyZero(lines))
    println(countWithOnlyOne(lines))
    println(countGroupByLineLength(lines))
}


fun countGroupByLineLength(lines: MutableList<String>): MutableList<Pair<Int, Int>> {
    return lines.groupBy { it.length }
        .map { v -> Pair(v.key, v.value.size) }
        .toCollection(mutableListOf())
}

fun countOddLines(lines: MutableList<String>): Long {
    return lines.stream()
        .filter { it.length % 2 == 0 }
        .count()
}

fun countWithTheSameCountOfElements(lines: MutableList<String>): Long {
    return lines.stream()
        .filter { countElements(it, '0') == countElements(it, '1') }
        .count()
}

fun countWithOnlyZero(lines: MutableList<String>) = lines.stream()
    .filter { countElements(it, '1') == 0L }
    .count()

fun countWithOnlyOne(lines: MutableList<String>) = lines.stream()
    .filter { countElements(it, '0') == 0L }
    .count()

fun countElements(line: String, sign: Char): Long {
    var sum = 0L
    for (c in line) {
        if (sign == c)
            sum++
    }
    return sum
}