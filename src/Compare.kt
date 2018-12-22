fun main(args: Array<String>) {
    val a = Integer(10)
    val b = Integer(10)
    println(a == b)  //For referential equality, we use the === symbol which allows us to evaluate the reference of an object (if it’s pointing to the same object). This is an equivalent of “==” operator in Java.
    println(a === b)

    val hobbies = arrayOf("Hiking, Chess")
    val hobbies2 = arrayOf("Hiking, Chess")

    println(hobbies contentEquals hobbies2)
}