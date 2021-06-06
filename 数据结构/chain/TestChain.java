package cn.dada.数据结构.chain;

public class TestChain {
    public static void main(String[] args) {
        Request requestA = new Request(RequestType.REQUEST_A);
        Request requestB = new Request(RequestType.REQUEST_B);
        Request requestC = new Request(RequestType.REQUEST_C);
//        Request requestC = new Request(RequestType.REQUEST_D); // test dead loop

        RequestHandler handlerA = new RequestAHandler();
        RequestHandler handlerB = new RequestBHandler();
        RequestHandler handlerC = new RequestCHandler();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
        // 环形责任链，当没有handler能处理时，将导致死循环，java.lang.StackOverflowError
        handlerC.setNextHandler(handlerA);

        handlerA.process(requestB);
        handlerB.process(requestC);
        handlerC.process(requestA);
    }
}
