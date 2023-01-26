package InsuranceManagementSystem;

import java.util.TreeSet;

class AccountManager {
    private TreeSet<Account> accountList;

    public AccountManager() {
        accountList = new TreeSet<Account>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public Account login(String email, String password) throws InvalidAuthenticationException {
        for (Account account : accountList) {
            if (account.login(email, password)) {
                return account;
            }
        }
        throw new InvalidAuthenticationException("Invalid email or password");
    }
}