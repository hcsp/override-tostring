package com.github.hcsp.inheritance;

public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new User(1, "user1"));
    }

    // 请在这里覆盖toString方法，使得在打印用户时能将用户的id和name打印出来

}
