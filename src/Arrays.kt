fun main(args: Array<String>) {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val animals = arrayOf("Cat", "Dog", "Lion", "Tiger")

    val firstElement = numbers[0]
    val lastElement = numbers[numbers.size - 1]
    println("$firstElement $lastElement")

    for (animal in animals) {
        println(animal)
    }
}
