package com.itheima.workspace;

import java.util.Scanner;

//键盘录入一个三位数，求这个三位数每一位的数字和。
public class work4 {
    public static void main(String[] args) {
        //1.先录入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个三位数:");
        int num = sc.nextInt();
        //2.获取各个位上的数
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        //3.三个数求和
        int result = ge+shi+bai;
        //4.输出结果
        System.out.println("键盘录入"+num+".那么每一位数字相加为:"+bai+"+"+shi+"+"+ge+",和为:"+result+".");
    }
}
