package design.stract.bridge

/**
 * 抽象
 */
abstract class Abstraction(iImplementor: IImplementor) {
    val iImplementor: IImplementor

    init {
        this.iImplementor = iImplementor
    }

    open fun operation() {
        iImplementor.operationImpl()
    }

}