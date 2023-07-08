package design.action.chain

/**
 * 具体处理链B
 */
class ConcreteHandlerB : BaseHandler() {
    override fun canHandle(request: String): Boolean {
        return request == "B"
    }

    override fun doHandle(request: String) {
        println("ConcreteHandlerB: Handling Request $request")
    }
}