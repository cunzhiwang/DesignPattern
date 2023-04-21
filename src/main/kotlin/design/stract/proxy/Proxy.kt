package design.stract.proxy

class Proxy constructor(subject: ISubject) : ISubject {
    var subject: ISubject

    init {
        this.subject = subject
    }

    override fun request() {
        before()
        subject.request()
        after()
    }

    fun before() = println("before")

    fun after() = println("after")
}