package com.java.maven.pojo;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String city;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(Integer id, String name, Integer age, String city, Double money) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", money=" + money +
                '}';
    }

    public User() {
    }

    public User(String name, Integer age, String city, Double money) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
