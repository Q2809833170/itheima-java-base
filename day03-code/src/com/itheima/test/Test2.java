package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //1.键盘录入两个时髦度
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入我们自己的衣服时髦度:");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的衣服时髦度:");
        int girlFashion = sc.nextInt();

        //2.比较两个时髦度的大小
        boolean result = myFashion > girlFashion;

        //3.打印结果
        System.out.println("我们的衣服时髦度比相亲对象的高吗?" + result);
    }
}
