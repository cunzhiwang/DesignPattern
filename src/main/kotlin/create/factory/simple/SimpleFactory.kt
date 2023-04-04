package create.factory.simple

/**
 * 产品工厂
 */
class SimpleFactory {

    companion object {
        fun makeProduct(kind: Int): IProduct? {
            var product: IProduct? =null
            when (kind) {
                0 -> product=ConcreteProductA()
                1 -> product=ConcreteProductB()
            }
            return product
        }
    }
}