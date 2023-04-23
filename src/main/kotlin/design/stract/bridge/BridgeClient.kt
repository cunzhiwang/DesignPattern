package design.stract.bridge

fun main() {
    val refinedAbstraction:Abstraction = RefinedAbstraction(ConcreteImplementor())
    refinedAbstraction.operation()
}