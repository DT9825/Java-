package com.itheima.lianxi;
//每逢7过；在1-100内，包含个位十位或者7的倍数就喊过；
public class demo1 {
    public static void main(String[] args){
        for(int i=1; i <= 100; i++){
            if (i%10==7 || i/10%10==7 || i%7==0){
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
