package com.tosan.example3;

import java.util.Comparator;

public class SortByDepositNumber implements Comparator<Deposit> {
    @Override
    public int compare(Deposit deposit1, Deposit deposit2) {
        return deposit1.getDepositNumber().compareTo(deposit2.getDepositNumber());
    }
}
