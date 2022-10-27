package com.sh.chain.of.responsibility.after;

import com.sh.chain.of.responsibility.before.Request;

public class PrintRequestHandler extends RequestHandler {
    private RequestHandler nextHandler;

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void handle(Request request){
        System.out.println(request.getBody());
        super.handle(request);
    }
}
