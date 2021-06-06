package cn.dada.接口隔离.mediator;

//抽象中介者
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague); //转发
}