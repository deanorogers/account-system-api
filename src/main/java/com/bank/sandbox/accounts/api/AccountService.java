package com.bank.sandbox.accounts.api;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

    public List<Account> retrieveAccountsForCustomer (String customerNbr) {

        List<Account> accounts = new ArrayList<>();
        for ( int i=1; i<=3; i++) {
            Account account = new Account(i,"20-10-01",1000, "dean-" + i);
            accounts.add(account);
        }
        return accounts;
    }

}
