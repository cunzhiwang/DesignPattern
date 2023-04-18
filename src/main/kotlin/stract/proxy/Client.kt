package stract.proxy

fun main() {
    val realSubject = RealSubject()
    Proxy(realSubject).request()
}