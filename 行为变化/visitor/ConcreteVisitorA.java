package cn.dada.行为变化.visitor;

/**
 * visitor可扩展，对于不同element的不同处理
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitElementA(Element element) {
        // mock doing sth with element
        System.out.println("[ConcreteVisitorA] visitElementA...");
    }

    @Override
    public void visitElementB(Element element) {
        // mock doing sth with element
        System.out.println("[ConcreteVisitorA] visitElementB...");
    }

    @Override
    public void visitElementC(Element element) {
        // mock doing sth with element
        System.out.println("[ConcreteVisitorA] visitElementC...");
    }
}
