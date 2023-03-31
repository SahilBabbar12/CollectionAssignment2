package com.knoldus.task15;

public class Person
{
    String name;
    Integer age;
    Person(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}