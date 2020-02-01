package com.company.task2;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String lastname;

    public Person() {
    }

    public Person(String name, String surname, String lastname) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, lastname);
    }
}
