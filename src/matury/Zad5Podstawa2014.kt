package matury

import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors

/**
 * https://cke.gov.pl/images/_EGZAMIN_MATURALNY_OD_2015/Arkusze_egzaminacyjne/2014/informatyka_PP_2_A1.pdf
 */
fun main(args: Array<String>) {
    val pary = Files.readAllLines(Paths.get("PARY_LICZB.TXT"))
        .stream()
        .map { mapLineToPairOfInts(it) }
        .collect(Collectors.toList())
    println(countWielokrotnosci(pary))
    println(countNWD(pary))
    println(countPairsWithTheSameSumOfDigits(pary))
}


fun countPairsWithTheSameSumOfDigits(pairs: MutableList<Pair<Int, Int>>): Long {
    return pairs.stream().filter { theSameSumOfDigits(it) }
        .count()
}

fun theSameSumOfDigits(pair: Pair<Int, Int>): Boolean {
    return sumOfDigits(pair.first) == sumOfDigits(pair.second)
}

fun countNWD(pairs: MutableList<Pair<Int, Int>>): Long {
    return pairs.stream()
        .filter { NWD(it) == 1 }
        .count()
}

fun NWD(pair: Pair<Int, Int>): Int {
    var a = pair.first
    var b = pair.second

    while (a != b) {
        if (a > b)
            a -= b;
        else
            b -= a;
    }
    return a
}

fun countWielokrotnosci(pairs: MutableList<Pair<Int, Int>>): Long {
    return pairs.stream()
        .filter { isWielokrotnosc(it) }
        .count()
}

fun mapLineToPairOfInts(line: String): Pair<Int, Int> {
    val split = line.split(" ")
    return Pair(split[0].toInt(), split[1].toInt())
}

fun isWielokrotnosc(pair: Pair<Int, Int>): Boolean {
    return (pair.first.toDouble() / pair.second.toDouble()) % 1 == 0.0 || (pair.second.toDouble() / pair.first) % 1 == 0.0
}
