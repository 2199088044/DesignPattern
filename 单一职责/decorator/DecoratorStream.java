package cn.dada.单一职责.decorator;

public class DecoratorStream implements Stream {
    /**
     * 装饰器模式的一个主要特征:
     * 既继承(或实现接口)，又有组合(即包含与实现的接口类型同类型的字段，本例子是Stream)
     * 继承(或实现接口)是为了完善接口的规范
     * 组合是为了在运行时绑定具体的stream实现类，实现对不同stream的操作
     */
    protected final Stream stream;

    protected DecoratorStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void read() {
        stream.read();
    }

    @Override
    public void write() {
        stream.write();
    }
}
