package com.sh.decorator.usage;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Collections가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);


        // runtime에 ClassCastException 발생
//        books.add(new Item()); // Exception in thread "main" java.lang.ClassCastException: Attempt to insert class com.sh.decorator.usage.DecoratorInJava$Item element into collection with element type class com.sh.decorator.usage.DecoratorInJava$Book

        List synchronizedList = Collections.synchronizedList(list);

        List unmodifiableList = Collections.unmodifiableList(list);
        list.add(new Item());
        unmodifiableList.add(new Book()); // java.lang.UnsupportedOperationException


        // 서블릿 요청 또는 응답 랩퍼
        // CustomHttpRequestWrapper(HttpServletRequest) 객체 작성 가능
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {

    }

    private static class Item {

    }
}
