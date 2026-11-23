package com.itheima.arithmeticoperator;

public class ArithmeticOperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);//5
        //-
        System.out.println(3 - 2);//1
        //*
        System.out.println(7 * 9);//63

        //如果计算的时候有小数参与
        //结论:
        //运行结果有可能不精确
        //原因:
        //Java 里 `double`（浮点数）采用二进制 IEEE 754 标准存储
        //很多十进制小数（如 0.1、1.1）无法用二进制精准表示，存储时就自带微小误差，运算后误差累积，结果就不精确。

        System.out.println(1.1 + 1.1);//2.2
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 - 1.01);//0.09000000000000008
        System.out.println(1.1 * 1.01);//1.1110000000000002
    }
}
