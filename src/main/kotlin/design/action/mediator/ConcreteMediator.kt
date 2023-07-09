package design.action.mediator

/**
 * 具体中介者
 */
class ConcreteMediator : Mediator {
    private lateinit var colleagueA: ConcreteColleagueA
    private lateinit var colleagueB: ConcreteColleagueB

    fun setColleagueA(colleague1: ConcreteColleagueA) {
        this.colleagueA = colleague1
    }

    fun setColleagueB(colleague2: ConcreteColleagueB) {
        this.colleagueB = colleague2
    }

    override fun notify(sender: Colleague, event: String) {
        when (sender) {
            colleagueA -> colleagueB.receive(event)
            colleagueB -> colleagueA.receive(event)
            else -> throw IllegalArgumentException("Unknown sender: $sender")
        }
    }
}