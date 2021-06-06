package cn.dada.接口隔离.adapter;

public class AdapteeClass implements IAdaptee{
    @Override
    public int foo() {
        return 1;
    }

    @Override
    public void bar(int data) {
        System.out.println(data);
    }
}
