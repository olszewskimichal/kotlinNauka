fun main(args: Array<String>) {
    println(SimpleSingleton.answer)
    println(SimpleSingleton.greet("Marian"))

    Counter.increment()
    println(Counter.currentCount())
    //println(Counter.count) // this will fail to compile

    val strings = listOf("Hello", "World")
    val sortedStrings = strings.sortedWith(ReverseStringComparator)
    println(sortedStrings)

    println(OuterClass.public)
    val outerClass = OuterClass()
    println(outerClass.getSecretValue())
}

class OuterClass {
    companion object {
        private val secret = "You can't see me"
        val public = "You can see me"
    }

    fun getSecretValue() = secret
}

object SimpleSingleton {
    val answer = 42
    fun greet(name: String) = "Hello, $name!"
}

object Counter {
    private var count: Int = 0

    fun currentCount() = count

    fun increment() {
        ++count
    }
}

object ReverseStringComparator : Comparator<String> {
    override fun compare(o1: String, o2: String) = o1.reversed().compareTo(o2.reversed())
}