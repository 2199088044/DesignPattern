package cn.dada.接口隔离.mediator;

import java.util.Objects;

//抽象同事类
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colleague colleague = (Colleague) o;
        return Objects.equals(mediator, colleague.mediator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator);
    }
}