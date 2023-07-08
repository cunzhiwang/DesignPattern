package design.action.chain

/**
 * 处理接口
 */
interface Handler {
    /**
     * 设置下一个处理链
     */
    fun setNextHandle(handler: Handler)

    /**
     * 处理方法
     */
    fun handle(request:String)
}