package stract.proxy

/**
 * 真实主题类（被代理类）
 */
class RealSubject :ISubject {
    override fun request() {
        println("实际主题")
    }
}