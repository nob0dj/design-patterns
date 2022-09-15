package com.sh.adapter.after1.adapter;

import com.sh.adapter.after1.account.Account;
import com.sh.adapter.after1.security.UserDetails;


public class AccountUserDetails implements UserDetails {
    private Account account;
    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
