fun main(args: Array<String>) {
    var x = 1
    while (x <= 5) {
        println("$x ")
        x++
    }

    x = 1
    do {
        print("$x ")
        x++
    } while (x <= 5)

    for (value in 1..10) {
        print("$value ")
    }

    val primeNumbers = intArrayOf(2, 3, 5, 7, 11)

    for (number in primeNumbers) {
        print("$number ")
    }

    for (index in primeNumbers.indices) {
        println("PrimeNumber(${index + 1}): ${primeNumbers[index]}")
    }

    repeat(10) { i ->
        println("This line will be printed 10 times")
        println("We are on the ${i + 1}. loop iteration")
    }
    val map = hashMapOf(1 to "foo", 2 to "bar", 3 to "baz")
    for ((key, value) in map) {
        println("Map[$key] = $value")
    }


}
