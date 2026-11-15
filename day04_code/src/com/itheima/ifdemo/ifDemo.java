package com.itheima.ifdemo;
import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("这是一个正数");
        } else if (num < 0) {
            System.out.println("这是一个负数");
        }
    }
}



