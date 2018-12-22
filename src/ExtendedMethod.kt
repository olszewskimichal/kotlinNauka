fun String.containsSpaces(): Boolean {
    return this.indexOf(" ") != -1
}

fun main(args: Array<String>) {
    println("abcd ".containsSpaces())
}