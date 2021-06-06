package cn.dada.状态变化.state;

//抽象状态类
public interface State {
    void Handle(Context context);
}