package design.create.builder

fun main() {
    val user = User.Builder()
        .firstName("John")
        .lastName("Doe")
        .age(30)
        .email("john.doe@example.com")
        .phone("123-456-7890")
        .build()

    println(user)
}