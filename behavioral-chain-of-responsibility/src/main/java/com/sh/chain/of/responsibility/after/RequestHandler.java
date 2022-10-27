package com.sh.chain.of.responsibility.after;

import com.sh.chain.of.responsibility.before.Request;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if(nextHandler != null)
            nextHandler.handle(request);
    }
}
