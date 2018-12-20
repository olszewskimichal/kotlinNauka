fun main(args: Array<String>) {
    val myInt = 100
    val myLong = myInt.toLong()   // Explicitly converting 'Int' to 'Long'

    val doubleValue = 176.80
    val intValue = doubleValue.toInt()  // 176

    val str = "1000"
    val intValueFromString = str.toInt()
    println("$myLong $intValue $intValueFromString")
}
