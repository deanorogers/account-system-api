package com.bank.sandbox.accounts.api;

import java.util.Date;

public class Transaction {

    public enum Direction {DEBIT, CREDIT};

    private String vendor;
    private Direction direction;
    private Date transactionDate;
    private long amount;
    private String type;

}
