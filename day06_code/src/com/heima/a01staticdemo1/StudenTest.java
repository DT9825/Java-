package com.heima.a01staticdemo1;

public class StudenTest {
    public static void main(String[] args) {
        //创建对象
        Student stu1 = new Student("张三", 18, "男");
        //调用方法
        Student.teacherName = "huang老师";
        //stu1.teacherName = "王老师";
        stu1.study();
        stu1.sleep();


        //创建第二个对象
        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(19);
        stu2.setSex("女");
        //调用方法
        stu2.study();
        stu2.sleep();


    }
}
