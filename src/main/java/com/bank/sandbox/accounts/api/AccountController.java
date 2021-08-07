package com.bank.sandbox.accounts.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/accounts")
    public List<Account> retrieveAccountsForCustomer() {
        logger.debug("About to retrieve accounts");
        AccountService accountService = new AccountService();
        List<Account> accounts = accountService.retrieveAccountsForCustomer("ABC123");
        return accounts;
    }

    @RequestMapping("/customer/{customernbr}/accounts")
    public List<Account> retrieveAccountsForCustomer(@PathVariable String customernbr) {
        logger.debug("About to retrieve accounts");
        AccountService accountService = new AccountService();
        List<Account> accounts = accountService.retrieveBulkAccountsForCustomer(customernbr);
        return accounts;
    }


}
