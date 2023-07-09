package design.action.chain

/**
 * 具体处理链A
 */
class ConcreteHandlerA : BaseHandler() {
    override fun canHandle(request: String): Boolean {
        return request == "A"
    }

    override fun doHandle(request: String) {
        println("ConcreteHandlerA: Handling Request $request")
    }
}