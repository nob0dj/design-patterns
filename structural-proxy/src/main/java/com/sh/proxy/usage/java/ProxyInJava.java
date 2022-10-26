package com.sh.proxy.usage.java;


import com.sh.proxy.after2.DefaultGameService;
import com.sh.proxy.after2.GameService;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        int result = gameServiceProxy.startGame();
        System.out.println("result = " + result);
    }

    private GameService getGameServiceProxy(GameService target) {
        // public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("before ◯△❏");
                    Object returnObj = method.invoke(target, args); // target객체의 method호출시 args전달!
                    System.out.println("after ◯△❏");
                    return returnObj;
                });
    }

    /*

    private GameService getGameServiceProxy(GameService target) {
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("◯△❏");
                        method.invoke(target, args); // target객체의 method호출시 args전달!
                        System.out.println("◯△❏");
                        return null;
                    }
                });
    }

     */
}
