package cn.dada.单一职责.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        FileStream fileStream = new FileStream();
        MemoryStream memoryStream = new MemoryStream();

        StreamEncodeDecorator streamEncodeDecorator;
        StreamBufferedDecorator streamBufferedDecorator;

        // encode operation使用StreamEncodeDecorator装饰器
        // file stream encode
        streamEncodeDecorator = new StreamEncodeDecorator(fileStream);
        streamEncodeDecorator.read();
        System.out.println("---------");
        // memory stream encode
        streamEncodeDecorator = new StreamEncodeDecorator(memoryStream);
        streamEncodeDecorator.write();
        System.out.println("---------");

        // buffered operation使用StreamBufferedDecorator装饰器
        // file stream buffered
        streamBufferedDecorator = new StreamBufferedDecorator(fileStream);
        streamBufferedDecorator.write();
        System.out.println("---------");
        // memory stream buffered
        streamBufferedDecorator = new StreamBufferedDecorator(memoryStream);
        streamBufferedDecorator.read();
    }
}
