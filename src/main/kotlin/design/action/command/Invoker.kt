package design.action.command

/**
 * 命令请求
 */
 class Invoker(command: ICommand) {

    private var command: ICommand

    init {
        this.command = command;
    }

    fun action() {
        command.execute()
    }
}