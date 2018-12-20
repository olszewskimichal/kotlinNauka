fun main(args: Array<String>) {
    val name = "Bill Gates"
    //name = "Satoshi Nakamoto"	// Error: Val cannot be reassigned

    val country: String = "India"

    val greeting = "Hello, World"  // type inferred as `String`
    val year = 2018                // type inferred as `Int`

    // Explicitly defining the type of variables
    val greeting2: String = "Hello, World"
    val year2: Int = 2018

    println("$name $country $greeting $greeting2 $year $year2")
}
