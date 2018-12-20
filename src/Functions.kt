fun main(args: Array<String>) {
    avg(4.6, 9.0)  // 6.8
    printAverage(10.0, 30.0)
    displayGreeting("Welcome")
    arithmeticSeriesSum(n = 10)
    arithmeticSeriesSum(1, 10)
    println(sumOfNumbers(1.0, 2.0, 3.0))

    val a = doubleArrayOf(1.5, 2.6, 5.4)
    println(sumOfNumbers(*a))  // Result = 9.5   Spread Operator
}

fun avg(a: Double, b: Double) = (a + b) / 2

fun printAverage(a: Double, b: Double) = println("Avg of ($a, $b) = ${(a + b) / 2}")

fun displayGreeting(message: String, name: String = "Guest") = println("Hello $name, $message")

fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1) = n / 2 * (2 * a + (n - 1) * d)

fun sumOfNumbers(vararg numbers: Double) = numbers.sum()

fun findBodyMassIndex(weightInKg: Double, heightInCm: Double): Double {
    // Validate the arguments
    if (weightInKg <= 0) {
        throw IllegalArgumentException("Weight must be greater than zero")
    }
    if (heightInCm <= 0) {
        throw IllegalArgumentException("Height must be greater than zero")
    }

    fun calculateBMI(weightInKg: Double, heightInCm: Double): Double {
        val heightInMeter = heightInCm / 100
        return weightInKg / (heightInMeter * heightInMeter)
    }

    // Calculate BMI using the nested function
    return calculateBMI(weightInKg, heightInCm)
}
