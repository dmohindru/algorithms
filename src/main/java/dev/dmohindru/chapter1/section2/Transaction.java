package dev.dmohindru.chapter1.section2;

import edu.princeton.cs.algs4.Date;

public class Transaction {
    private final String name;
    private final Date date;

    private final double amount;

    public Transaction(String name, Date date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Date: %s, Amount: %f", name, date.toString(), amount);
    }

    @Override
    public boolean equals(Object transaction) {
        if (this == transaction)
            return true;
        else if (!(transaction instanceof Transaction))
            return false;
        Transaction transactionObj = (Transaction) transaction;

        return transactionObj.getName().equals(name) &&
                transactionObj.getDate().equals(date) &&
                transactionObj.getAmount() == amount;
    }
}
