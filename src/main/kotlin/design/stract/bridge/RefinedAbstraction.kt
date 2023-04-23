package design.stract.bridge

 class RefinedAbstraction(iImplementor: IImplementor) : Abstraction(iImplementor) {
    override fun operation() {
        println("抽象实现")
        iImplementor.operationImpl()
    }
}