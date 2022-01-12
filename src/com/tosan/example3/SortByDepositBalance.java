package com.tosan.example3;

import java.util.Comparator;

public class SortByDepositBalance implements Comparator<Deposit> {
    @Override
    public int compare(Deposit deposit1, Deposit deposit2) {
        int com = deposit1.getBalance().compareTo(deposit2.getBalance());
        if(com == 0){
            return -deposit1.getDepositNumber().compareTo(deposit2.getDepositNumber());
        }
        return com;
    }
}
