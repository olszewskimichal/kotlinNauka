package classes.abstracts

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        // Code to start a Car
        println("Car Started")
    }

    override fun stop() {
        // Code to stop a Car
        println("Car Stopped")
    }
}