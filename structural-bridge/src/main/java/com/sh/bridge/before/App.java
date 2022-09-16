package com.sh.bridge.before;

import com.sh.bridge.after.아리;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.skillQ(); // KDA 아리 Q
        kda아리.skillR(); // KDA 아리 R

        Champion poolParty아리 = new PoolParty아리();
        poolParty아리.skillQ(); // PoolParty 아리 Q
        poolParty아리.skillR(); // PoolParty 아리 R
    }
}
