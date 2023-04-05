package create.factory.method

fun main() {
    val factoryA = ConcreteFactoryA()
    factoryA.makeProduct().doSomeThing()
    var factoryB = ConcreteFactoryB()
    factoryB.makeProduct().doSomeThing()
}