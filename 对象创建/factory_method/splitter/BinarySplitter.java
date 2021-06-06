package cn.dada.对象创建.factory_method.splitter;

public class BinarySplitter implements ISplitter {
    @Override
    public void split() {
        System.out.println("[BinarySplitter] splitting file...");
    }
}
