class Loops {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var x = 1
            while(x <= 5) {
                println("$x ")
                x++
            }

            x = 1
            do {
                print("$x ")
                x++
            } while(x <= 5)

            for(value in 1..10) {
                print("$value ")
            }

            var primeNumbers = intArrayOf(2, 3, 5, 7, 11)

            for(number in primeNumbers) {
                print("$number ")
            }

            for(index in primeNumbers.indices) {
                println("PrimeNumber(${index+1}): ${primeNumbers[index]}")
            }
        }
    }
}