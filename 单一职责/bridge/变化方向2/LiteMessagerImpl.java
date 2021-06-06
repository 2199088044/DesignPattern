package cn.dada.单一职责.bridge.变化方向2;

public class LiteMessagerImpl extends MessagerImpl {
    @Override
    public void playSound() {
        System.out.println("[LiteMessagerImpl] lite version playing sound...");
    }

    @Override
    public void writeText() {
        System.out.println("[LiteMessagerImpl] lite version writing text...");
    }
}
