package com.itheima.ifdemo;
import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的钱数：");
        int money = sc.nextInt();
        if (money>=100){
            System.out.println("你可以吃一个汉堡");
        }else{
            System.out.println("你没有钱吃");
        }
    }
}



