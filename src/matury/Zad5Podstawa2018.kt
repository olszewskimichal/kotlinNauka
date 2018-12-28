package matury

import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors

/**
 * https://cke.gov.pl/images/_EGZAMIN_MATURALNY_OD_2015/Arkusze_egzaminacyjne/2018/formula_do_2014/informatyka/MIN-P2_1P-182.pdf
 */
fun main(args: Array<String>) {
    val liczby = Files.readAllLines(Paths.get("liczby.txt"))
        .stream()
        .map { it.toInt() }
        .collect(Collectors.toList())
    theBiggestOddNumber(liczby)
    println(findPalindromeNumbers(liczby))

    println(findNumbersWithSumOfDigitsBiggerThen30(liczby))
    println(sumOfDigitsFromNumberList(liczby))
}

fun sumOfDigitsFromNumberList(numbers: List<Int>): Int {
    return numbers.stream()
        .map { sumOfDigits(it) }
        .mapToInt { it.toInt() }
        .sum()
}

fun findNumbersWithSumOfDigitsBiggerThen30(numbers: List<Int>): MutableList<Int> {
    return numbers.stream()
        .filter { sumOfDigits(it) > 30 }
        .collect(Collectors.toList())
}

fun sumOfDigits(number: Int): Int {
    val arr = number.toString().toList()
    return arr.map { it.toString().toInt() }.sum()
}

fun findPalindromeNumbers(numbers: List<Int>): MutableList<Int>? {
    return numbers.stream()
        .filter { isPalindromNumber(it) }
        .collect(Collectors.toList())
}

fun theBiggestOddNumber(numbers: List<Int>) {
    val max = numbers.stream()
        .filter { it % 2 == 0 }
        .max(Comparator { o1, o2 -> o1.compareTo(o2) })
        .orElse(-1)
    println("Najwieksza liczba parzysta to $max")
}

fun isPalindromNumber(number: Int) = number.toString() == number.toString().reversed()