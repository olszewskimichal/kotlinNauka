package classes.dataclass

fun main(args: Array<String>) {
    val customer1 = Customer(1, "John")
    val customer2 = Customer(1, "John")

    println(customer1.equals(customer2))  // Prints true

    val customer3 = Customer(2, "Robert")
    println("Customer Details : $customer3")

    val customer = Customer(3, "James")

/*
   Copies the customer object into a separate Object and updates the name.
   The existing customer object remains unchanged.
*/
    val updatedCustomer = customer.copy(name = "James Altucher")
    println("Customer : $customer")
    println("Updated Customer : $updatedCustomer")
}