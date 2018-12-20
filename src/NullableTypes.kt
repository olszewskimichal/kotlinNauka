fun main(args: Array<String>) {
    var greeting: String = "Hello, World"
    //greeting = null // Compilation Error

    var nullableGreeting: String? = "Hello, World"
    nullableGreeting = null // Works

    val len = greeting.length
    val upper = greeting.toUpperCase()

    // val len = nullableGreeting.length // Compilation Error
    // val upper = nullableGreeting.toUpperCase()  // Compilation Error

    val nullableName: String? = "John"

    if (nullableName != null) {
        println("Hello, ${nullableName.toUpperCase()}.")
        println("Your name is ${nullableName.length} characters long.")
    } else {
        println("Hello, Guest")
    }

    nullableName?.toUpperCase()

    val name = nullableName ?: "Guest"      //is same as val name = if(nullableName != null) nullableName else "Guest"
    val len2 = nullableName?.length ?: -1


    var listOfNullableTypes: List<Int?> = listOf(1, 2, null, 3) // Works
    val notNullList: List<Int> = listOfNullableTypes.filterNotNull()
}
