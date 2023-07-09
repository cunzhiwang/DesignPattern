package design.action.mediator

fun main() {
    val mediator = ConcreteMediator()
    val colleagueA = ConcreteColleagueA(mediator)
    val colleagueB = ConcreteColleagueB(mediator)

    mediator.setColleagueA(colleagueA)
    mediator.setColleagueB(colleagueB)

    colleagueA.send("Hello, colleague2!")
    colleagueB.send("Hi, colleague1!")
}