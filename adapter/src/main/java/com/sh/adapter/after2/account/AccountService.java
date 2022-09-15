package com.sh.adapter.after2.account;

import com.sh.adapter.after2.security.UserDetails;
import com.sh.adapter.after2.security.UserDetailsService;

/**
 * Adaptee
 */
public class AccountService implements UserDetailsService {

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }

    /**
     * 테스트용 임의의 코드
     * @param username
     * @return
     */
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
