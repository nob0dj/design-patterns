package com.sh.observer.after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        
        User honggd = new User("honggd");
        chatServer.subscribe("추석", honggd);
        chatServer.subscribe("디자인패턴", honggd);

        User sinsa = new User("sinsa");
        chatServer.subscribe("디자인패턴", sinsa);

        chatServer.sendMessage(honggd, "디자인패턴", "이번에 Obserber 패턴!");
        chatServer.sendMessage(sinsa, "추석", "추석에 한번, 설에 한번... 일년에 두번밖에 못보다니!");
    }
}
