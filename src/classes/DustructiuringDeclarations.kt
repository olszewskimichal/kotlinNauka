package classes


data class PersonGOT(var firstName: String, var lastName: String,var age : Int)

fun main(args: Array<String>) {
    val person = PersonGOT("Jon", "Snow", 20)
    val(firstname, lastName, age) = person
    println(firstname)
    println(lastName)
    println(age)

    val firstname2 = person.component1()
    val lastName2 = person.component2()
    val age2 = person.component3()
    println(firstname2)
    println(lastName2)
    println(age2)
}