package create.factory.method

fun main() {
    val factoryA = ConcreteFactoryA()
    factoryA.makeProduct().doSomeThing()
    val factoryB = ConcreteFactoryB()
    factoryB.makeProduct().doSomeThing()
}