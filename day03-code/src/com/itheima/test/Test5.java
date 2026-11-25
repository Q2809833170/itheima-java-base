package com.itheima.test;
//练习2-求三个数的最大值
//一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm。
//请用程序实现获取这三个和尚的最高身高。
//

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //1.键盘录入三个数据
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三个数据:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //2.利用三元运算符进行判断

        int temp = num1 > num2 ? num1 : num2;
        int max = num3 > temp ? num3 : temp;

        System.out.println("三个和尚的最高身高为:"+max+"cm");

    }
}
