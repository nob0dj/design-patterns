package com.sh.bridge.after;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.move(); // KDA 아리 move
        kda아리.skillQ(); // KDA 아리 Q
        kda아리.skillW(); // KDA 아리 W


        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.move(); // PoolParty 아리 move
        poolParty아리.skillR(); // PoolParty 아리 R
        poolParty아리.skillW(); // PoolParty 아리 W

        Champion 정복자아칼리 = new 아칼리(new 정복자());
        정복자아칼리.move(); // 정복자 아칼리 move
        정복자아칼리.skillE(); // 정복자 아칼리 E
        정복자아칼리.skillR(); // 정복자 아칼리 R
    }
}
