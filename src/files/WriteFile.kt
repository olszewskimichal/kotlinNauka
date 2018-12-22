package files

import java.io.File

fun main(args: Array<String>) {
    File("testowyPlik2.txt").writeText("abcd\nasbc")

    //File("testowyPlik2.txt").writeBytes(fileContentAsArray)

    File("testowyPlik2.txt").appendText("\ncccc")
}

