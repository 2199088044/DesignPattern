package cn.dada.接口隔离.mediator;

import java.util.HashSet;
import java.util.Set;

//具体中介者
public class ConcreteMediator extends Mediator {
    private final Set<Colleague> colleagues = new HashSet<>();

    public void register(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    // 中介者模式解决的是系统内的多个对象的互相依赖，这里仅简单实现了给除自己以外的对象发送消息，并未指定接收者
    public void relay(Colleague colleague) {
        for (Colleague ob : colleagues) {
            // 给除自己以外的对象发送消息
            if (!ob.equals(colleague)) {
                ob.receive();
            }
        }
    }
}