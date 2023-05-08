package design.action.command

fun main() {
    val concreteCommand = ConcreteCommand()
    val invoker = Invoker(concreteCommand)
    invoker.action()
}