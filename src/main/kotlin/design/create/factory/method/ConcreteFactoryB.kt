package design.create.factory.method

/**
 * 具体工厂B
 */
class ConcreteFactoryB :IFactory{
    override fun makeProduct(): IProduct {
       return ConcreteProductB()
    }
}