package com.itheima.lianxi;
import java.util.Scanner;
//求平方根
//求质数
public class demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = sc.nextInt();
       /* for(int i=1; i <= a; i++){
            if (i*i == a){
                System.out.println("平方根为："+i);
                break;
            }else if(i*i > a){
                System.out.println("平方根为："+(i-1));
                break;
            }
        }*/
        if (a <= 1) {
            System.out.println("既不是质数也不是合数");
        } else {
            boolean isPrime = true;              // 先假设它是质数
            for (int i = 2; i < a; i++) {        // 只试到 a-1
                if (a % i == 0) {                // 找到了因数
                    isPrime = false;             // 推翻假设
                    break;                       // 已经确定是合数，不用再试了
                }
            }
            if (isPrime) {                       // 循环走完都没被推翻 → 是质数
                System.out.println("是质数");
            } else {
                System.out.println("不是质数");
            }
        }
    }
}
