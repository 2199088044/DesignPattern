package cn.dada.单一职责.bridge.变化方向1;

import cn.dada.单一职责.bridge.变化方向2.MessagerImpl;

public abstract class Messager {
    protected MessagerImpl mImpl;

    protected Messager(MessagerImpl mImpl) {
        this.mImpl = mImpl;
    }

    public abstract void login();

    public abstract void logoff();

    public void playSound(){
        mImpl.playSound();
    }

    public void writeText(){
        mImpl.writeText();
    }
}
