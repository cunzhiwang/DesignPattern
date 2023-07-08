package design.action.chain

/**
 * 客户端调用
 */
fun main() {
    val handlerA = ConcreteHandlerA()
    val handlerB = ConcreteHandlerB()
    val handlerC = ConcreteHandlerC()
    val defaultHandler = DefaultHandler()

    handlerA.next = handlerB
    handlerB.next = handlerC
    handlerC.next=defaultHandler

    handlerA.handle("A")
    handlerA.handle("B")
    handlerA.handle("C")
    handlerA.handle("D")
}