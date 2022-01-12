package com.tosan.example5;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5");
        list.add("3");
//        Set<String> set = new HashSet<>(list);
//        set.add("3");
//        set.forEach(t-> System.out.println(t));
//        SortedSet<String> sortedSet = new TreeSet<>();
//        sortedSet.addAll(set);
//        sortedSet.add("8");
//        sortedSet.forEach(t-> System.out.println(t));
//        sortedSet.clear();
//        System.out.println("------");
//        sortedSet.forEach(t-> System.out.println(t));
//        Queue<String> queue = new PriorityQueue<>(sortedSet);
//        list.contains("2");
//        set.contains("3");
//        sortedSet.contains("2");
//        queue.contains("5");

        list.forEach(t-> System.out.println(t));
        Collections.sort(list);
        list.forEach(t-> System.out.println(t));
    }
}
