package com.tosan.example3;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
//        SortedSet<Deposit> set = new TreeSet<>(new Comparator<Deposit>() {
//            @Override
//            public int compare(Deposit deposit1, Deposit deposit2) {
//                return deposit1.getDepositNumber().compareTo(deposit2.getDepositNumber());
//            }
//        });
        SortedSet<Deposit> set = new TreeSet<>(new SortByDepositBalance());
        set.add(new Deposit("1", new BigDecimal(100)));
        set.add(new Deposit("2", new BigDecimal(150)));
        set.add(new Deposit("3", new BigDecimal(150)));
        set.add(new Deposit("4", new BigDecimal(200)));
        set.add(new Deposit("5", new BigDecimal(50)));
        set.add(new Deposit("0", new BigDecimal(500)));
        set.forEach(t-> System.out.println(t));
//        System.out.println(set.first());
//        System.out.println(set.last());
    }
}
