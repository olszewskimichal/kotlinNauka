package classes.inheritance

class InheritanceExample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val teacher = Teacher()
            val mathsTeacher = MathsTeacher()

            teacher.teach()  // Teaching...
            mathsTeacher.teach() // Teaching Maths.

            val employee = Employee()
            println(employee.baseSalary) // 30000.0

            val programmer = Programmer()
            println(programmer.baseSalary) // 50000.0
        }
    }
}