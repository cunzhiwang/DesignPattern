package design.action.command

/**
 * 具体命令
 */
class ConcreteCommand : ICommand {
    private var receiver: Receiver = Receiver()
    override fun execute() {
        receiver.action()
    }
}