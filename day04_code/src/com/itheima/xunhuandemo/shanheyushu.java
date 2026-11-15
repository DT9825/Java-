package com.itheima.xunhuandemo;
import java.util.Scanner;

//求商和余数；要求不能使用乘除法和取余运算；
public class shanheyushu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0;
        while(a>=b) {
            a -= b;
            num++;
        }
        System.out.println("商为："+num);
        System.out.println("余数为："+a);
    }
}
