package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        int a[] = new int[100];
        int i = 0;
        for (; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] % 5 == 0) {
                hashSet.add(i);
            }
            for (int k : hashSet) {
                System.out.println("Первые: " + hashSet);
            }
            for (int j = 0; j < a.length; j++) {
                if (a[j] % 5 != 0) {
                    for (int k : hashSet) {
                        hashSet.add(j);
                        System.out.println("Последние: " + hashSet);
                    }
                }
            }
        }
    }
}
