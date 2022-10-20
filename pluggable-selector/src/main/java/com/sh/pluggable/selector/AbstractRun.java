package com.sh.pluggable.selector;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class AbstractRun {

    private String name;

    protected AbstractRun(String name) {
        this.name = name;
    }

    public void run() {
        Class<?>[] parameterTypes = null;
        Object[] args = null;
        try {
            Method method = getClass().getDeclaredMethod(name, parameterTypes);
            method.invoke(this, args);
        } catch (NoSuchMethodException | SecurityException e) {
            // getDeclaredMethod가 던지는 예외
            e.printStackTrace();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            // invoke가 던지는 예외
            e.printStackTrace();
        }

    }


    public void a() {
    }

    public void b() {
    }


}

class Foo extends AbstractRun {
    public Foo(String name) {
        super(name);
    }

    @Override
    public void a() {
        System.out.println("Foo#a 호출!");
    }
}

class Bar extends AbstractRun {
    public Bar(String name) {
        super(name);
    }

    @Override
    public void b() {
        System.out.println("Bar#b 호출!");
    }
}
