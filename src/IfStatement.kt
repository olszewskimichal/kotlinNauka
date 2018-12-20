fun main(args: Array<String>) {
    val n = 34
    if (n % 2 == 0) {
        println("$n is even")
    }


    val a = 32
    val b = 55
    if (a > b) {
        println("max($a, $b) = $a")
    } else {
        println("max($a, $b) = $b")
    }
    val max = if (a > b) a else b
    println("max($a, $b) = $max")

    val age = 17
    if (age < 12) {
        println("Child")
    } else if (age in 12..17) {
        println("Teen")
    } else if (age in 18..21) {
        println("Young Adult")
    } else if (age in 22..30) {
        println("Adult")
    } else if (age in 30..50) {
        println("Middle Aged")
    } else {
        println("Old")
    }
}
