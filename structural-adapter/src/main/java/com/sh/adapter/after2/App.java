package com.sh.adapter.after2;

import com.sh.adapter.after1.adapter.AccountUserDetailsService;
import com.sh.adapter.after2.account.AccountService;
import com.sh.adapter.after2.security.SecurityController;
import com.sh.adapter.after2.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService(); // adaptee
        // target <<interface>> UserDetailService/UserDetails
        // adapter/adaptee AccountService/AccountDetails
        UserDetailsService userDetailsService = new AccountService();
        SecurityController controller = new SecurityController(userDetailsService); // client
        String username = controller.login("honggd", "honggd");// username/password 같게 테스트!
        System.out.println(username);
    }
}
