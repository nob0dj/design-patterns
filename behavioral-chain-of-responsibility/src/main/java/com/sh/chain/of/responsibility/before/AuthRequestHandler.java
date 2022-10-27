package com.sh.chain.of.responsibility.before;

public class AuthRequestHandler extends RequestHandler {

    public void handle(Request request) {
        System.out.println("인증이 되었나?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");
        super.handle(request);
    }
}
