package create.factory.method
/**
 * 具体工厂A
 */
class ConcreteFactoryA : IFactory {
    override fun makeProduct(): IProduct {
        return ConcreteProductA()
    }
}