package cn.dada.对象创建.factory_method.splitter;

public class VideoSplitter implements ISplitter {
    @Override
    public void split() {
        System.out.println("[VideoSplitter] splitting file...");
    }
}
