package cn.dada.组件协作.template_method;

public class SubClass2 extends SuperClass {
    @Override
    protected void step2() {
        System.out.println("[SubClass2] step2 invoked");
    }

    public static void main(String[] args) {
        new SubClass2().guGanMethod();
    }
}
