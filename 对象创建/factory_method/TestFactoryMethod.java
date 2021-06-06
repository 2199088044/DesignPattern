package cn.dada.对象创建.factory_method;

import cn.dada.对象创建.factory_method.factory.BinarySplitterFactory;
import cn.dada.对象创建.factory_method.factory.SplitterFactory;
import cn.dada.对象创建.factory_method.factory.VideoSplitterFactory;

public class TestFactoryMethod {
    public static void main(String[] args) {
        SplitterFactory binaryFactory = new BinarySplitterFactory();
        SplitterFactory videoFactory = new VideoSplitterFactory();
        MainForm form = new MainForm(binaryFactory);
        form.process();

        form = new MainForm(videoFactory);
        form.process();
    }
}
