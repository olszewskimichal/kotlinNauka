package files

import java.io.File

fun main(args: Array<String>) {
    File("testowyPlik.txt").forEachLine {
        println(it)
    }

    val useLines = File("testowyPlik.txt").useLines { it.toList() }
    println(useLines)

    val readLines = File("testowyPlik.txt").bufferedReader().readLines()
    println(readLines)

    val lines = File("testowyPlik.txt").readLines()
    println(lines)

    val toString = File("testowyPlik.txt").inputStream().readBytes().toString(Charsets.UTF_8)
    println(toString)
}