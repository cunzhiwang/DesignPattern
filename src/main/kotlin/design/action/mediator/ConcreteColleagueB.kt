package design.action.mediator

/**
 * 具体同事B
 */
class ConcreteColleagueB (mediator: Mediator) : Colleague(mediator) {
    override fun receive(event: String) {
        println("ConcreteColleague2 received event: $event")
    }
}