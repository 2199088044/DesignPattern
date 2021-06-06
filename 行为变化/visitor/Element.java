package cn.dada.行为变化.visitor;

public interface Element {
    void accept(Visitor visitor);
}
