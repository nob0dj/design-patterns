package com.sh.chain.of.responsibility.after;

import com.sh.chain.of.responsibility.before.Request;

public class LoggingRequestHandler extends RequestHandler {
    private RequestHandler nextHandler;

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void handle(Request request){
        System.out.println("<< 로깅 처리 >>");
        super.handle(request);
    }
}
