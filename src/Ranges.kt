fun main(args: Array<String>) {
    for (i in 1..4) print(i) // prints "1234"
    for (i in 4..1) print(i) // prints nothing
    println()

    for (i in 4 downTo 1) print(i) // prints "4321"
    println()

    for (i in 1..4 step 2) print(i) // prints "13"
    println()

    for (i in 4 downTo 1 step 2) print(i) // prints "42"
    println()

    for (i in 1 until 10) { // i in [1, 10), 10 is excluded
        println(i)
    }
}