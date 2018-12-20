package classes.properties


class User(_id: Int, _name: String, _age: Int) {
    // Properties of User class
    val id: Int = _id         // Immutable (Read only)
    var name: String = _name
        // Custom Getter
        get() {
            return field.toUpperCase()
        }
    var age: Int = _age       // Mutable
}

class ClassProps {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val user = User(1, "Jack Sparrow", 44)

// Getting a Property
            val name = user.name
            println(name)

// Setting a Property
            user.age = 46

// You cannot set read-only properties
            // user.id = 2    // Error: Val cannot be assigned
        }
    }
}