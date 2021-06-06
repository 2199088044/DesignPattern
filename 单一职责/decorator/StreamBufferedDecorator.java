package cn.dada.单一职责.decorator;

public class StreamBufferedDecorator extends DecoratorStream {
    public StreamBufferedDecorator(Stream stream) {
        super(stream);
    }

    public void read() {
        super.read();
        this.buffered();
    }

    public void write() {
        super.write();
        this.buffered();
    }

    private void buffered() {
        // mock buffer operation
        System.out.println("[StreamBufferedDecorator] buffered...");
    }
}
