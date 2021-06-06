package cn.dada.行为变化.visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        Element elementC = new ConcreteElementC();

        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        elementA.accept(visitorA);
        elementA.accept(visitorB);
        elementB.accept(visitorB);
        elementC.accept(visitorB);
    }
}
