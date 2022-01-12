package com.tosan.example3;

import java.math.BigDecimal;
import java.util.Objects;

public class Deposit implements Comparable<Deposit> {
    private String depositNumber;
    private BigDecimal balance;

    public Deposit(){

    }

    public Deposit(String depositNumber, BigDecimal balance){
        setBalance(balance);
        setDepositNumber(depositNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Objects.equals(depositNumber, deposit.depositNumber);
    }

    @Override
    public int hashCode() {
        return depositNumber.hashCode();
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Deposit deposit) {
        // if this > deposit -> 1
        // if this == deposit -> 0
        // if this < deposit -> -1
//        return this.balance.compareTo(deposit.balance);
        if(this.balance.longValue() > deposit.balance.longValue()){
            return 1;
        }
        if(this.balance.longValue() == deposit.balance.longValue()){
            return 0;
        }
        if(this.balance.longValue() < deposit.balance.longValue()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositNumber='" + depositNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
