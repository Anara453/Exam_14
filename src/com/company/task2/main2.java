package com.company.task2;

import java.util.LinkedList;

public class main2 {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("О","О","П");
        LinkedList <Person> person = new LinkedList<>();
        int i = 0;
         for (; i < person1.hashCode(); i ++)
        if (person.equals(person1)) throw new  Exception ("Ошибка есть повторяющиеся елементы");
    }
}
