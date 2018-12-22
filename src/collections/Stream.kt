package collections

fun main(args: Array<String>) {
    val result = listOf(1, 2, 3, 4, 5)
        .map { n -> n * n }.first { n -> n < 10 }
    println(result)

    val oddSquared = listOf(1, 2, 3, 4, 5)
        .filter { n -> n % 2 == 1 } // 1, 3, 5
        .map { n -> n * n } // 1, 9, 25
        .drop(1) // 9, 25
        .take(1) // 9
    println(oddSquared)

    val target = mutableListOf(1, 2, 3, 4, 5)
    listOf(1, 2, 3, 4, 5)
        .filterTo(target) { n -> n % 2 == 0 }
    println(target)

    val numbers = listOf(1, 2, 3)
    val words = listOf("one", "two", "three")
    val zip = numbers.zip(words)

    println(zip)

    val squares = listOf(1, 2, 3, 4,5)
        .associate { n -> n to n * n }
    println(squares)

    val originalArray = arrayOf("val1", 2, "val3", 4, "val5", 6)
    val actualList = originalArray.takeWhile { it is String }
    println(actualList)

    val originalMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val filteredMap = originalMap.filter { it.value < 2 }
    println(filteredMap)

    val original = arrayOf(1, 2, 3, 2, 1)
    val actual = original.slice(3 downTo 1)
    println(actual)

    val array = arrayOf(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9)
    val result2 = array.distinct()
    println(result2)

    val dnaFragment = "ATTCGCGGCCGCCAA"
    val fragments = dnaFragment.chunked(3)
    println(fragments)
}