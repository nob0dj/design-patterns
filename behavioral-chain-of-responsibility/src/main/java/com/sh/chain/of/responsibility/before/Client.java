package com.sh.chain.of.responsibility.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
//        RequestHandler requestHandler = new RequestHandler();
//        RequestHandler requestHandler = new AuthRequestHandler();
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handle(request);
    }
}
