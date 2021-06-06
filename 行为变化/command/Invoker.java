package cn.dada.行为变化.command;

import java.util.List;

//调用者
public class Invoker {
    private List<Command> commandList;

    public Invoker(List<Command> commandList) {
        this.commandList = commandList;
    }

    public void setCommand(List<Command> commandList) {
        this.commandList = commandList;
    }

    public void call() {
        for (Command command : commandList) {
            System.out.println("调用者执行命令command: " + command);
            command.execute();
        }
    }
}
