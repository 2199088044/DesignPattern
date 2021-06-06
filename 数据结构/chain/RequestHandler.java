package cn.dada.数据结构.chain;

public abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public abstract boolean canHandle(Request request);

    public abstract void process(Request request);

    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
