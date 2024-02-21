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

    public Transaction(String transaction) {
        String[] transactionToken = transaction.split(" ");
        if (transactionToken.length != 3) {
            throw new IllegalArgumentException("Invalid transaction format: " + transaction);
        }
        String[] dateToken = transactionToken[1].split("/");

        // Set name
        this.name = transactionToken[0];

        // Set Date
        if (dateToken.length != 3) {
            throw new IllegalArgumentException("Invalid date format: " + transactionToken[1]);
        }
        try {
            int month = Integer.parseInt(dateToken[0]);
            int day = Integer.parseInt(dateToken[1]);
            int year = Integer.parseInt(dateToken[2]);


            this.date = new Date(month, day, year);

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid date format: " + transactionToken[1]);
        }

        // Set Amount
        try {
            double amount = Double.parseDouble(transactionToken[2]);
            this.amount = amount;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid transaction format: " + transaction);
        }

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
