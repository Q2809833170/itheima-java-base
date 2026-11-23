package com.itheima.demo01;
//1.导包
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        2.创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
//        3.接收键盘输入的数字
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int number2 = sc.nextInt();
//        4.输出结果
        System.out.println(number1+number2);
    }
}
