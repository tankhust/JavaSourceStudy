package com.tank;

/**
 * @author tank
 * @create 2020/05/03 15:48
 */
public class Student {
    private int age;
    private String name;
    private int score;
    private int id;

    public Student(int age, String name, int score,int id) {
        this.age = age;
        this.name = name;
        this.score = score;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
