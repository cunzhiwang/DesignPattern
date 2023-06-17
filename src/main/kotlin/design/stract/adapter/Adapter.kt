package design.stract.adapter

// 适配器
class Adapter : Adaptee(), ITarget {
    override fun request(): Int = specificRequest()
}