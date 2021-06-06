package cn.dada.组件协作.template_method;

public abstract class SuperClass {

    // 骨干方法，这里分3步，其中1，3两步为不变(稳定)，2为变化
    public void guGanMethod() {
        step1();
        step2();
        step3();
    }

    protected void step1() {
        System.out.println("step1 invoked");
    }

    // 晚绑定
    protected abstract void step2();

    protected void step3() {
        System.out.println("step3 invoked");
    }
}
