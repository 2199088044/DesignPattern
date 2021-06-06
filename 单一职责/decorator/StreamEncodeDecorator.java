package cn.dada.单一职责.decorator;

public class StreamEncodeDecorator extends DecoratorStream {
    public StreamEncodeDecorator(Stream stream) {
        super(stream);
    }

    public void read() {
        super.read();
        this.encode();
    }

    public void write() {
        super.write();
        this.encode();
    }

    private void encode() {
        // mock encode operation
        System.out.println("[StreamEncodeDecorator] encode...");
    }
}
