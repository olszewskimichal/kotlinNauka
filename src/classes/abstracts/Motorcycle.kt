package classes.abstracts

class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        // Code to Start the Motorcycle
        println("Bike Started")
    }

    override fun stop() {
        // Code to Stop the Motorcycle
        println("Bike Stopped")
    }
}