package collections

fun main(args: Array<String>) {
    val list: List<String?> = listOf("a", null, "b")

    val res = list.filterNotNull()
    println(res)
}