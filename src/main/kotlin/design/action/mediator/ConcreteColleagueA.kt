package design.action.mediator

/**
 * 具体同事A
 */
class ConcreteColleagueA (mediator: Mediator) : Colleague(mediator) {
    override fun receive(event: String) {
        println("ConcreteColleague1 received event: $event")
    }
}