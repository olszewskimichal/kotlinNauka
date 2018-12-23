fun main(args: Array<String>) {
    println(Color.BLUE.rgb)
    println(AbstractColor.BLUE.rgb)
    println(AbstractColor.BLUE.colorString())

    println(Planet.MARS) // MARS[population=0]
    Planet.MARS.population = 3
    println(Planet.MARS) // MARS[population=3]
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class AbstractColor {
    RED {
        override val rgb: Int = 0xFF0000
    },
    GREEN {
        override val rgb: Int = 0x00FF00
    },
    BLUE {
        override val rgb: Int = 0x0000FF
    }
    ;
    abstract val rgb: Int
    fun colorString() = "#%06X".format(0xFFFFFF and rgb)
}

/**
 * Enums can be mutable, this is another way to obtain a singleton behavior:
 */
enum class Planet(var population: Int = 0) {
    EARTH(7 * 100000000),
    MARS();
    override fun toString() = "$name[population=$population]"
}

