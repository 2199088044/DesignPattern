package cn.dada.行为变化.command;

//具体命令
public class ConcreteCommandA implements Command {
    private final Receiver receiver;

    ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

    @Override
    public String toString() {
        return "ConcreteCommandA{" + "receiver=" + receiver + '}';
    }
}
