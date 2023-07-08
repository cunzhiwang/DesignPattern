package design.action.chain

/**
 * 默认处理链
 */
class DefaultHandler :Handler{

    override fun setNextHandle(handler: Handler) {

    }

    override fun handle(request: String) {
        println("DefaultHandler: Unable to Handle Request $request")
    }
}