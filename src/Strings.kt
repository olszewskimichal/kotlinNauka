fun main(args: Array<String>) {
    val text = """
 |Tell me and I forget.
 |Teach me and I remember.
 |Involve me and I learn.
 |(Benjamin Franklin)
 """.trimMargin()

    println(text)

    val str = "Hello, World!"
    println(str[1]) // Prints e

    for (c in str) {
        println(c)
    }


    val i = 10
    val s = "i = $i" // evaluates to "i = 10"
    println(s)
}