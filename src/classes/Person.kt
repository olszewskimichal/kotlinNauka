package classes

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null

    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = if (age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }
}