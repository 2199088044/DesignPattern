package cn.dada.数据结构.chain;

public class Request {
    private final RequestType requestType;

    public Request(RequestType requestType) {
        this.requestType = requestType;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    @Override
    public String toString() {
        return "Request{" + "requestType=" + requestType.getDesc() + '}';
    }
}
