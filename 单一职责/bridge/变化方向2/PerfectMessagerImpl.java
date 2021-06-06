package cn.dada.单一职责.bridge.变化方向2;

public class PerfectMessagerImpl extends MessagerImpl {
    @Override
    public void playSound() {
        System.out.println("[PerfectMessagerImpl] perfect version playing sound...");
    }

    @Override
    public void writeText() {
        System.out.println("[PerfectMessagerImpl] perfect version writing text...");
    }
}
