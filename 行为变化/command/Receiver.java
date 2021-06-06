package cn.dada.行为变化.command;

//接收者
public class Receiver {
    private final String receiverName;

    public Receiver(String receiverName) {
        this.receiverName = receiverName;
    }

    public void action() {
        System.out.println("接收者:" + receiverName + "的action()方法被调用...");
    }

    @Override
    public String toString() {
        return "Receiver{" + "receiverName='" + receiverName + '\'' + '}';
    }
}