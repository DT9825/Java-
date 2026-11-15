package com.itheima.lianxi;

import java.util.Random;
import java.util.Scanner;

//猜数字小游戏
public class demo3 {
    public static void main(String[] args){
        // 1. 随机生成一个1-100之间的整数
        Random random = new Random();
        int num = random.nextInt(100)+1;//包左不包右，所以要+1，才能得到1-100之间的整数;
        // 2. 提示用户输入一个数
        while(true) {// 无限循环，直到用户猜对为止,注意不能写在随机数生成之前；
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int a = sc.nextInt();
            // 3. 比较用户输入的数和随机数
            if (a == num) {
                System.out.println("恭喜你猜对了");
                break;
            } else if (a > num) {
                System.out.println("你猜的数太大了");
            } else {
                System.out.println("你猜的数太小了");
            }
        }
    }
}
