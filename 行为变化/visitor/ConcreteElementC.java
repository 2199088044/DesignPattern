package cn.dada.行为变化.visitor;

/**
 * 使用visitor模式的大前提，不能再有新的element类型
 */
public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementC(this);
    }
}
