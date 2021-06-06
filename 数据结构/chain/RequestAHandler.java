package cn.dada.数据结构.chain;

public class RequestAHandler extends RequestHandler {

    @Override
    public boolean canHandle(Request request) {
        return RequestType.REQUEST_A.equals(request.getRequestType());
    }

    @Override
    public void process(Request request) {
        if (canHandle(request)) {
            System.out.println("[RequestAHandler] handle request: " + request);
        }
        else {
            if (nextHandler != null) {
                nextHandler.process(request);
            }
            else {
                System.out.println("no handler can handle the request: " + request);
            }
        }
    }
}