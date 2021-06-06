package cn.dada.领域规则.interpreter;

//抽象表达式类
public interface Expression {
    boolean interpret(String info);
}
