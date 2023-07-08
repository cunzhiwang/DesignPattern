package design.action.chain

/**
 * 处理基类，里面可以处理一些公共逻辑
 *
 */
abstract class BaseHandler : Handler {
    var next: Handler? = null

    override fun handle(request: String) {
        if (canHandle(request)) {
            doHandle(request)
        } else {
            next?.handle(request)
        }
    }

    override fun setNextHandle(handler: Handler) {
        this.next=handler
    }

    protected abstract fun canHandle(request: String): Boolean

    protected abstract fun doHandle(request: String)
}