package cn.dada.接口隔离.mediator;

//具体同事类2
public class ConcreteColleague3 extends Colleague {
    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }

    public void send() {
        System.out.println("具体同事类3发出请求。");
        mediator.relay(this); //请中介者转发
    }
}