package cn.dada.状态变化.state;

//具体状态A类
public class ConcreteStateA implements State {
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}