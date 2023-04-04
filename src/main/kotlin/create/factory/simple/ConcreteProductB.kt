package create.factory.simple

/**
 * 实际产品
 */
class ConcreteProductB : IProduct {
    override fun doSomeThing() {
        println("这是产品")
    }
}