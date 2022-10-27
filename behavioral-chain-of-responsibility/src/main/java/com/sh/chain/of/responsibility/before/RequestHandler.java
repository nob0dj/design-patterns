package com.sh.chain.of.responsibility.before;

public class RequestHandler {

    public void handle(Request request) {
        System.out.println(request.getBody());
    }
}
