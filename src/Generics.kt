fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass("value")
    println(parameterizedClass.getValue())

    val parameterizedClass1 = ParameterizedClass(parameterizedClass)
    println(parameterizedClass1.getValue())


    val parameterizedProducer = ParameterizedProducer("string")

    val ref: ParameterizedProducer<Any> = parameterizedProducer

    println(ref is ParameterizedProducer<Any>)

    val parameterizedConsumer = ParameterizedConsumer<Number>()

    val ref2: ParameterizedConsumer<Double> = parameterizedConsumer

    println(ref2 is ParameterizedConsumer<Double>)
}

class ParameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return value
    }

    override fun toString(): String {
        return "ParameterizedClass(value=$value)"
    }
}

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}