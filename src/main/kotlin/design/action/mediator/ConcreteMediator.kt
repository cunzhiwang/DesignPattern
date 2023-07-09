package design.action.mediator

/**
 * 具体中介者
 */
class ConcreteMediator : Mediator {
    private lateinit var colleagueA: ConcreteColleagueA
    private lateinit var colleagueB: ConcreteColleagueB

    fun setColleagueA(colleagueA: ConcreteColleagueA) {
        this.colleagueA = colleagueA
    }

    fun setColleagueB(colleagueB: ConcreteColleagueB) {
        this.colleagueB = colleagueB
    }

    override fun notify(sender: Colleague, event: String) {
        when (sender) {
            colleagueA -> colleagueB.receive(event)
            colleagueB -> colleagueA.receive(event)
            else -> throw IllegalArgumentException("Unknown sender: $sender")
        }
    }
}