package com.bank.sandbox.accounts.api;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccountService {

    public List<Account> retrieveAccountsForCustomer (String customerNbr) {

        List<Account> accounts = new ArrayList<>();
        for ( int i=1; i<=3; i++) {
            Account account = new Account(i,"20-10-01",1000, "dean-" + i);
            accounts.add(account);
        }
        return accounts;
    }

    public List<Account> retrieveBulkAccountsForCustomer (String customerNbr) throws IOException {

        List<Account> accounts = new ArrayList<>();

        try {

            // File inputf = ResourceUtils.getFile("classpath:accounts.csv");
            // InputStream inputFS = new FileInputStream(inputf);

            System.out.println("Using ClassPathResource");

            Resource resource = new ClassPathResource("accounts.csv");
            InputStream inputFS = resource.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            // skip the header of the csv file
            accounts = br.lines()
                    .skip(1)
                    .map(mapToItem)
                    .collect(Collectors.toList());

        } catch ( FileNotFoundException ex ) {
            throw new RuntimeException(ex.getMessage());
        }
        return accounts;

    }

    private Function<String, Account> mapToItem = (line) -> {

        String[] p = line.split(",");
        Account item = new Account();
        item.setAccountNbr(Integer.valueOf( p[0]));
        item.setBalance(Long.valueOf(p[1]));
        item.setSortCode(p[2]);
        item.setName(p[3]);
        item.setCustomerNbr(p[4]);
        return item;
    };

}
