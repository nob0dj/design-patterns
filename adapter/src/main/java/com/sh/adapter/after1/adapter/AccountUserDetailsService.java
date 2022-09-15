package com.sh.adapter.after1.adapter;

import com.sh.adapter.after1.account.Account;
import com.sh.adapter.after1.account.AccountService;
import com.sh.adapter.after1.security.UserDetails;
import com.sh.adapter.after1.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
