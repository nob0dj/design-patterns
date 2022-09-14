package com.sh.adapter.after1;

/**
 * Adaptee
 */
public class AccountService {

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
