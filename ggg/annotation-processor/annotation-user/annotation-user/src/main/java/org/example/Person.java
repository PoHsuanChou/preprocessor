package org.example;

public class Person {
    private int age;

    private String name;
    @BuilderProperty
    public int getAge() {
        return age;
    }
    @BuilderProperty
    public void setAge(int age) {
        this.age = age;
    }
    @BuilderProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
