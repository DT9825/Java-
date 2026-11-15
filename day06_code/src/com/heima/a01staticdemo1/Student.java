package com.heima.a01staticdemo1;

public class Student {
    //属性：姓名，年龄，性别
    private String name;
    private int age;
    private String sex;
    public static String teacherName;


    public Student() {
        //无参构造方法
        System.out.println("无参构造方法");
    }

    //有参构造方法
    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("有参构造方法");
    }

    //方法：设置姓名，年龄，性别
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //方法：获取姓名，年龄，性别
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    //行为：学习
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void sleep() {
        System.out.println(name + "," + age + "," + sex + "," + teacherName + "正在睡觉");
    }

}