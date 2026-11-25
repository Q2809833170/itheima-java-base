package com.itheima.ternaryoperator;

public class TernaryOperatorDemo1 {
    public static void main(String[] args) {
        //三元运算符的使用
        //格式: 条件表达式?表达式1:表达式2;
        int number1 = 10;
        int number2 = 20;
        int max =number1>number2?number1:number2;
        System.out.println(max);
        System.out.println(number1>number2?number1:number2);
    }
}
