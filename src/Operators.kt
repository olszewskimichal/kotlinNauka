class Operators {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var a = 10
            var b = 20
            val c = ((a + b) * ( a + b))/2   // 450

            val isALessThanB = a < b   // true

            a++     // a now becomes 11
            b += 5  // b equals to 25 now
            println("$a $c $isALessThanB")

            1 shl 2   // Equivalent to 1.shl(2), Result = 4
            16 shr 2  // Result = 4
            2 and 4   // Result = 0
            2 or 3    // Result = 3
            4 xor 5   // Result = 1
            4.inv()   // Result = -5

            2 == 2 && 4 != 5  // true
            4 > 5 && 2 < 7    // false
            !(7 > 12 || 14 < 18)  // false
        }
    }
}