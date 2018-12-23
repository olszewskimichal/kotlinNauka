fun main(args: Array<String>) {
    val regex = Regex(pattern = "[cd]")
    println(regex.containsMatchIn(input = "abc"))
    println(regex.matches("abc"))

    val phoneNumber :String? = Regex(pattern = """\d{3}-\d{3}-\d{4}""")
        .find(input = "phone: 123-456-7890, e..")?.value // phoneNumber: 123-456-7890
    println(phoneNumber)

    val matchedResults = Regex(pattern = """\d+""").findAll(input = "ab12cd34ef")
    val result = StringBuilder()
    for (matchedText in matchedResults) {
        result.append(matchedText.value + " ")
    }
    println(result) // => 12 34

    val a = Regex("""\d+""").matchEntire("100")?.value // a: 100
    val b = Regex("""\d+""").matchEntire("100 dollars")?.value // b: null
    println("$a $b")


    val resultSplit = Regex("""\d+""").split("ab12cd34ef") // a: [ab, cd, ef]
    println(resultSplit)

    val resultReplace = Regex("""\d+""").replace("ab12cd34ef", "x") // result: abxcdxef
    println(resultReplace)
}