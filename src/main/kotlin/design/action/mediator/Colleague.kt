package design.action.mediator

/**
 * 抽象同事类
 */
abstract class Colleague(private val mediator: Mediator) {
    fun send(event: String) {
        mediator.notify(this, event)
    }
    abstract fun receive(event: String)
}