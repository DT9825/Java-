package com.heima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {1,2,3,4,5};
        //调用方法
        System.out.println(ArrayUtil.printArr(arr));

        double[] arr2 = {1.2,2.3,3.4,4.5,5.6};
        System.out.println(ArrayUtil.getAverage(arr2));

    }

}
