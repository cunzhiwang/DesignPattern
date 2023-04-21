package design.create.factory.abstract_simple

/**
 * 产品工厂
 */
class SimpleFactory {

    companion object {
        fun makeProduct(kind: Int): IProduct? {
            var product: IProduct? = null
            when (kind) {
                Const.productA -> product = ConcreteProductA()
                Const.productB -> product = ConcreteProductB()
            }
            return product
        }
    }
}