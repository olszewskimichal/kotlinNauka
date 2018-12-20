package classes

class Student (val rollNumber: Int,
               val name: String)

class PersonExample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Calls the primary constructor (Age will be null in this case)
            val person1 = Person("Bill", "Gates")

            // Calls the secondary constructor
            val person2 = Person("Jeff", "Bezos", 53)

            val student = Student(1, "John")
            println(student.rollNumber)
            println(student.name)

            //student.name = "Jack" // Error: Val can not be assigned
        }
    }
}