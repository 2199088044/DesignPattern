package cn.dada.接口隔离.mediator;

public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague c1, c2, c3;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        c3 = new ConcreteColleague3();

        mediator.register(c1);
        mediator.register(c2);
        mediator.register(c3);

        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
