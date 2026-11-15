package com.heima.a02staticdemo2;

public class ArrayUtil {
    //私有化构造方法
    private ArrayUtil() {
        //私有化构造方法，防止外部创建对象
    }

    //静态方法：求数组的和
    public static String printArr(int[] arr) {
        //遍历数组
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAverage(double[] arr) {
        //遍历数组
        double sum = 0.0;
        for(double d : arr){
            sum += d;
        }
        return sum / arr.length;
    }

}
