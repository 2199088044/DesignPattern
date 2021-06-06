package cn.dada.行为变化.command;

import java.util.ArrayList;
import java.util.List;

public class TestCommand {
    public static void main(String[] args) {
        Receiver receiverA = new Receiver("接收者A");
        Receiver receiverB = new Receiver("接收者B");

        Command cmdA = new ConcreteCommandA(receiverA);
        Command cmdB = new ConcreteCommandB(receiverB);

        List<Command> commandList = new ArrayList<>();
        commandList.add(cmdA);
        commandList.add(cmdB);
        commandList.add(cmdA);
        Invoker invoker = new Invoker(commandList);

        invoker.call();
    }
}

