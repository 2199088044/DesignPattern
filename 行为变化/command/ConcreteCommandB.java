package cn.dada.行为变化.command;

//具体命令
public class ConcreteCommandB implements Command {
    private final Receiver receiver;

    ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

    @Override
    public String toString() {
        return "ConcreteCommandB{" + "receiver=" + receiver + '}';
    }
}
