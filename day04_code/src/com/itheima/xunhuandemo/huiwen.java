package com.itheima.xunhuandemo;
import java.util.Scanner;

// 回文数
public class huiwen {
    public static void main(String[] args){
        //核心思路：把一个数反转过来，如果和原数相同，就是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        //定义一个变量用于最后比较
        int temp = num;
        //定义一个变量用于存储反转后的数
        int reverse = 0;
        //把num反转过来
        while(num!=0){
            //从右往左取数
            int ge = num%10;
            //把ge拼接起来
            reverse = reverse*10 + ge;
            //更新num
            num /= 10;
        }
        //判断是否是回文数
        if(temp==reverse){
            System.out.println("这是一个回文数");
        }else{
            System.out.println("这不是一个回文数");
        }
    }
}
