package com.itheima.demo01;
//1.导包 ----  Scanner类位,这个类可以接收键盘输入的数字
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
//        2.创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
//        3.接收键盘输入的数字
        int i = sc.nextInt();
//        4.输出结果
        System.out.println(i);
    }
}
