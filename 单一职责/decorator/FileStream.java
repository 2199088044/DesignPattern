package cn.dada.单一职责.decorator;

public class FileStream implements Stream {
    @Override
    public void read() {
        System.out.println("[FileStream] read...");
    }

    @Override
    public void write() {
        System.out.println("[FileStream] write...");
    }
}
