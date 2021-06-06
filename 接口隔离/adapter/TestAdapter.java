package cn.dada.接口隔离.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        AdapteeClass adaptee = new AdapteeClass();
        IAdapter adapter = new AdapterClass(adaptee);
        adapter.process();
    }
}
