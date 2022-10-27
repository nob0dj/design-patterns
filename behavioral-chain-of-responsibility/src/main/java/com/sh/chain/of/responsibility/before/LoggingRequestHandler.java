package com.sh.chain.of.responsibility.before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
