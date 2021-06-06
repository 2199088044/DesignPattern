package cn.dada.对象创建.factory_method.factory;

import cn.dada.对象创建.factory_method.splitter.ISplitter;
import cn.dada.对象创建.factory_method.splitter.VideoSplitter;

public class VideoSplitterFactory implements SplitterFactory {

    @Override
    public ISplitter create() {
        return new VideoSplitter();
    }
}
