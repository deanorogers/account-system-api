package com.bank.sandbox.accounts.api;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    public Account() {
    }

    public int getAccountNbr() {
        return accountNbr;
    }

    public void setAccountNbr(int accountNbr) {
        this.accountNbr = accountNbr;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Account(int accountNbr, String sortCode, long balance, String name) {
        this.accountNbr = accountNbr;
        this.sortCode = sortCode;
        this.balance = balance;
        this.name = name;
    }

    private int accountNbr;
    private String sortCode;
    private long balance;
    private String name;
    private List<Transaction> transactions;

}
