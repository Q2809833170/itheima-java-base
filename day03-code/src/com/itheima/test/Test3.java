package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //1.键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int number2 = sc.nextInt();
        //2.如果一个数是6,则输出true;如果他们的和是6的倍数,则输出true;否则输出false
        int sum = number1 + number2;
        //3.使用逻辑运算符实现
        //a==6 或者 b==6 或者 a+b是6的倍数
        boolean result = number1 == 6 || number2 == 6 || sum % 6 == 0;
        System.out.println(result);

    }
}
