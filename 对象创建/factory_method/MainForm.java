package cn.dada.对象创建.factory_method;

import cn.dada.对象创建.factory_method.factory.SplitterFactory;
import cn.dada.对象创建.factory_method.splitter.ISplitter;

public class MainForm {
    private final SplitterFactory splitterFactory;

    public MainForm(SplitterFactory splitterFactory) {
        this.splitterFactory = splitterFactory;
    }

    public void process() {
        ISplitter splitter = splitterFactory.create();
        splitter.split();
    }
}
