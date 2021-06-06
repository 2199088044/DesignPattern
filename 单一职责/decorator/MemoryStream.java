package cn.dada.单一职责.decorator;

public class MemoryStream implements Stream {
    @Override
    public void read() {
        System.out.println("[MemoryStream] read...");
    }

    @Override
    public void write() {
        System.out.println("[MemoryStream] write...");
    }
}
