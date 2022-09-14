package com.sh.adapter.after1;

import com.sh.adapter.after1.adapter.AccountUserDetails;
import com.sh.adapter.after1.adapter.AccountUserDetailsService;
import com.sh.adapter.after1.security.SecurityController;
import com.sh.adapter.after1.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService(); // adaptee
        // target <<interface>> UserDetailService/UserDetails
        // adapter AccountUserDetailsService/AccountDetails
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        SecurityController controller = new SecurityController(userDetailsService); // client
        String username = controller.login("honggd", "honggd");// username/password 같게 테스트!
        System.out.println(username);
    }
}
