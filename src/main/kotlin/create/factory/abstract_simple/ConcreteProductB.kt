package create.factory.abstract_simple

/**
 * 实际产品
 */
class ConcreteProductB : IProduct {
    override fun doSomeThing() {
        println("这是产品B")
    }
}