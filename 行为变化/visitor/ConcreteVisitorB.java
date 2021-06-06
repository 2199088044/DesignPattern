package cn.dada.行为变化.visitor;

/**
 * visitor可扩展，对于不同element的不同处理
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visitElementA(Element element) {
        // mock doing sth with element
        System.out.println("[ConcreteVisitorB] visitElementA...");
    }

    @Override
    public void visitElementB(Element element) {
        // mock doing sth with element
        System.out.println("[ConcreteVisitorB] visitElementB...");
    }

    @Override
    public void visitElementC(Element element) {
        // mock doing sth with element
        System.out.println("[ConcreteVisitorB] visitElementC...");
    }
}
