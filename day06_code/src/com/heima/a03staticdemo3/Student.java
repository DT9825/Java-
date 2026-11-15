package com.heima.a03staticdemo3;

public class Student {
    //属性
    private int name;
    private int age;
    private double score;

    //方法
    public Student() {
        //默认构造方法
    }

    //有参构造方法
    public Student(int name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //set方法
    public void setName(int name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //get方法
    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}

