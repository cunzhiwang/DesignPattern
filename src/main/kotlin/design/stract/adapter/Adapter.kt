package design.stract.adapter

class Adapter : Adaptee(), ITarget {
    override fun request(): Int = specificRequest()
}