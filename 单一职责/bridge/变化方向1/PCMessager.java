package cn.dada.单一职责.bridge.变化方向1;

import cn.dada.单一职责.bridge.变化方向2.MessagerImpl;

public class PCMessager extends Messager {

    public PCMessager(MessagerImpl mImpl) {
        super(mImpl);
    }

    @Override
    public void login() {
        System.out.println("[PCMessager] login...");
    }

    @Override
    public void logoff() {
        System.out.println("[PCMessager] logoff");
    }
}
