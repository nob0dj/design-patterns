package com.sh.adapter.usage;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {

    public static void main(String[] args) {
        // DispatcherServlet#doService -> DispatcherServlet#doDispatch
        // HandlerAdapter#handle을 호출하고, ModelAndVier를 반환받는다.
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

        // HandlerAdapter인터페이스의 구현체는 많다.
        // 가장 많이 사용하는 RequestMappingHandlerAdpater도 그중 하나.
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
    }
}
