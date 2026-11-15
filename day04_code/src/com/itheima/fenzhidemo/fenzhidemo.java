package com.itheima.fenzhidemo;
import java.util.Scanner;
public class fenzhidemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想吃的美食：");
        String food = sc.nextLine();
        switch(food){
            case "汉堡":
                System.out.println("你可以吃一个汉堡");
                break;
            case "鱼香肉丝":
                System.out.println("你可以吃一个鱼香肉丝");
                break;
            default:
                System.out.println("你没有钱吃");
                break;
        }
    }
}
