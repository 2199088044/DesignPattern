package cn.dada.状态变化.state;

//具体状态B类
public class ConcreteStateB implements State {
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}