package classes.abstracts

fun main(args: Array<String>) {

    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)

    car.displayDetails()
    motorCycle.displayDetails()

    car.start()
    motorCycle.start()
}