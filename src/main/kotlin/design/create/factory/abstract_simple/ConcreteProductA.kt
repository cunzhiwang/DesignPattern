package design.create.factory.abstract_simple

/**
 * 具体产品（ConcreteProduct）：是简单工厂模式的创建目标
 */
class ConcreteProductA : IProduct {
    override fun doSomeThing() {
        println("这是产品A")
    }
}