package newIn11


typealias OscarWinners = HashMap<String, String>

fun countLaLaLand(oscarWinners: OscarWinners) =
    oscarWinners.count { it.value.contains("La La Land") }

// Note that the type names (initial and the type alias) are interchangeable:
fun checkLaLaLandIsTheBestMovie(oscarWinners: Map<String, String>) =
    oscarWinners["Best picture"] == "La La Land"

fun main(args: Array<String>) {
    val oscarWinners = HashMap<String, String>()
    oscarWinners["Best picture"] = "La La Land"
    oscarWinners["Best music"] = "La La Land"
    oscarWinners["Best something"] = "Something"

    println(countLaLaLand(oscarWinners))
    println(checkLaLaLandIsTheBestMovie(oscarWinners))
}