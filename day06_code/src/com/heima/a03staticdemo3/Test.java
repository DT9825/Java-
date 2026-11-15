package com.heima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建一个集合对象
        ArrayList<Student> list = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student(1001, 18, 90.0);
        Student s2 = new Student(1002, 19, 85.0);
        Student s3 = new Student(1003, 20, 95.0);
        //将学生对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //调用静态方法
        int max = StudentUtil.getAverageStudent(list);
        System.out.println(max);
    }
}
