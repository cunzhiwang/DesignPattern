package design.action.mediator

/**
 * 中介者
 */
interface Mediator {
    fun notify(sender: Colleague, event: String)
}