import java.util.*

fun main(args: Array<String>) {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val animals = arrayOf("Cat", "Dog", "Lion", "Tiger")

    val firstElement = numbers[0]
    val lastElement = numbers[numbers.size - 1]
    println("$firstElement $lastElement")

    for (animal in animals) {
        println(animal)
    }

    val empty = emptyArray<String>()
    println(empty)

    val strings = Array(size = 5, init = { index -> "Item #$index" })
    println(Arrays.toString(strings)) // prints "[Item #0, Item #1, Item #2, Item #3, Item #4]"
    println(strings.size) // prints 5


    val booleanArrayOf = booleanArrayOf(true, false)
    println(Arrays.toString(booleanArrayOf))

    val a = Array(3) { i -> i * 2 }
    println(Arrays.toString(a))

    val nullArray = arrayOfNulls<Int>(3)
    println(Arrays.toString(nullArray))

    val doubles = doubleArrayOf(1.5, 3.0)
    println(doubles.average()) // prints 2.25
    println(doubles.sum())
    println(doubles.max())

}
