package com.sh.chain.of.responsibility.after;

import com.sh.chain.of.responsibility.before.Request;

public class AuthRequestHandler extends RequestHandler {
    private RequestHandler nextHandler;

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void handle(Request request){
        System.out.println("<< 인증 처리 >>");
        super.handle(request);
    }
}
