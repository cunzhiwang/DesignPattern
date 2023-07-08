package design.action.chain

/**
 * 具体处理链C
 */
class ConcreteHandlerC : BaseHandler() {
    override fun canHandle(request: String): Boolean {
        return request == "C"
    }

    override fun doHandle(request: String) {
        println("ConcreteHandlerC: Handling Request $request")
    }
}