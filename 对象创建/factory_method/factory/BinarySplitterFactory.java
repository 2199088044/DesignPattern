package cn.dada.对象创建.factory_method.factory;

import cn.dada.对象创建.factory_method.splitter.BinarySplitter;
import cn.dada.对象创建.factory_method.splitter.ISplitter;

public class BinarySplitterFactory implements SplitterFactory {

    @Override
    public ISplitter create() {
        return new BinarySplitter();
    }
}
