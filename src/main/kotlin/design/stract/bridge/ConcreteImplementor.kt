package design.stract.bridge

class ConcreteImplementor :IImplementor {
    override fun operationImpl() {
        println("具体实现")
    }
}