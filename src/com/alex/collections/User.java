package com.alex.collections;

/**
 *
 * @author akrivokonev
 */
public class User {
    private String name;
    private String inn;
    private int age;

    public User(String name, String inn, int age) {
       this.name = name;
       this.inn = inn;
       this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
}
