package classes.inheritance

// Base class (Super class)
// Parent class
open class Computer(val name: String, val brand: String)

// Child class (initializes the parent class)
class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand)

open class Teacher {
    // Must use "open" modifier to allow child classes to override it
    open fun teach() {
        println("Teaching...")
    }
}

class MathsTeacher : Teacher() {
    // Must use "override" modifier to override a base class function
    override fun teach() {
        println("Teaching Maths...")
    }
}

open class Employee {
    // Use "open" modifier to allow child classes to override this property
    open val baseSalary: Double = 30000.0
}

class Programmer(
    override val baseSalary: Double = 50000.0 // Use "override" modifier to override the property of base class
) : Employee()