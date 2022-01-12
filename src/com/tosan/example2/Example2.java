package com.tosan.example2;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
//        Set<String> strings = new HashSet<>();
//        strings.add("1");
//        strings.add("2");
//        strings.add("2");
//        strings.forEach(t -> System.out.println(t));
//        Set<Deposit> deposits = new HashSet<>();
//        deposits.add(new Deposit("2", new BigDecimal(100)));
//        deposits.add(new Deposit("1", new BigDecimal(200)));
//        deposits.add(new Deposit("2", new BigDecimal(400)));
//        deposits.forEach(t -> System.out.println(t.getDepositNumber() + " " + t.getBalance()));
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(10);
        set1.add(12);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(12);
        set2.add(2);
        set2.add(0);
//        set2.retainAll(set1);
//        set2.addAll(set1);
//        set2.removeAll(set1);
        set2.forEach(t-> System.out.println(t));
    }
}
