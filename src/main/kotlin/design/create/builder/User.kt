package design.create.builder

class User private constructor(
    private val firstName: String?,
    private val lastName: String?,
    private val age: Int,
    private val email: String?,
    private val phone: String?
) {
    data class Builder(
        var firstName: String? = null,
        var lastName: String? = null,
        var age: Int = 0,
        var email: String? = null,
        var phone: String? = null
    ) {
        fun firstName(firstName: String) = apply { this.firstName = firstName }
        fun lastName(lastName: String) = apply { this.lastName = lastName }
        fun age(age: Int) = apply { this.age = age }
        fun email(email: String) = apply { this.email = email }
        fun phone(phone: String) = apply { this.phone = phone }
        fun build() = User(firstName, lastName, age, email, phone)
    }

    override fun toString(): String {
        return "User(firstName=$firstName, lastName=$lastName, age=$age, email=$email, phone=$phone)"
    }
}