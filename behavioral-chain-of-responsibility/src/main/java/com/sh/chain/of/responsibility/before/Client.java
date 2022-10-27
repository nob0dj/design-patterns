package com.sh.chain.of.responsibility.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.handle(request);
    }
}
