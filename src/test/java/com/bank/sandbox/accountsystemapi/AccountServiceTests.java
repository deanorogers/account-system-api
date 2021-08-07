package com.bank.sandbox.accountsystemapi;

import com.bank.sandbox.accounts.api.Account;
import com.bank.sandbox.accounts.api.AccountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class AccountServiceTests {

    AccountService accountService = new AccountService();

    @Test
    public void retrieveAllAccounts () {

        List<Account> fetchedAccounts = accountService.retrieveAccountsForCustomer("100");
        assertEquals(3, fetchedAccounts.size(), "Incorrect number of accounts retrieved");
    }

    @Test
    public void retrieveBulkAccountsForCustomer () {

        List<Account> fetchedAccounts = accountService.retrieveBulkAccountsForCustomer("100");
        for ( Account account : fetchedAccounts ) {
            System.out.println("Account [" + account.getAccountNbr() + ", " + account.getName() + "]");
        }
        assertEquals(100, fetchedAccounts.size(), "Incorrect number of accounts retrieved");
    }

}
