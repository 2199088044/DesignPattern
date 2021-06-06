package cn.dada.单一职责.bridge.变化方向1;

import cn.dada.单一职责.bridge.变化方向2.MessagerImpl;

public class MobileMessager extends Messager {

    public MobileMessager(MessagerImpl mImpl) {
        super(mImpl);
    }

    @Override
    public void login() {
        System.out.println("[MobileMessager] login...");
    }

    @Override
    public void logoff() {
        System.out.println("[MobileMessager] logoff");
    }
}
