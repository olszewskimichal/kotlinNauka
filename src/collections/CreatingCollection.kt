package collections

fun main(args: Array<String>) {
    val theList = listOf("one", "two", "three")     //readOnly
    val theMutableList = mutableListOf("one", "two", "three")  //RW

    val theSet = setOf("one", "two", "three")       //readOnly
    val theMutableSet = mutableSetOf("one", "two", "three") //RW

    println("two" in theList)
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("four", "five", "six")
    val resultList = firstList + secondList
    println(resultList)

    val firstList2 = listOf("one", "two", "three")
    val secondList2 = listOf("one", "three")
    val resultList2 = firstList2 - secondList2
    println(resultList2)

    val theList3 = listOf("one", "two", "three")
    val resultList3 = theList3.slice(1..2)
    println(resultList3)

    val theList4 = listOf(1, 2, 3, 4, 5, 6)
    val resultMap = theList4.groupBy { it % 3 }
    println(resultMap)
}