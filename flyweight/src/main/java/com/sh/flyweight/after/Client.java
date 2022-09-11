package com.sh.flyweight.after;

public class Client {

    public static void main(String[] args) {
        FontFactory factory = new FontFactory();
        Character c1 = new Character('h', "white", factory.getFont("Nanum:12"));
        Character c2 = new Character('e', "white", factory.getFont("Nanum:12"));
        Character c3 = new Character('l', "white", factory.getFont("Nanum:12"));
        Character c4 = new Character('l', "white", factory.getFont("Nanum:12"));
        Character c5 = new Character('o', "white", factory.getFont("Nanum:12"));
    }

}
