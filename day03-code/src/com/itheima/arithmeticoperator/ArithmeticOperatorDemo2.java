package com.itheima.arithmeticoperator;

public class ArithmeticOperatorDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335

        //取模
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1

        //应用场景:
        //1.可以用取模来判断,A是否可以被B整除
        //A % B     10 % 3
        //2.可以判断A是否为偶数
        //A % 2 如果结果为0,则A是偶数,反之,A是奇数
    }
}
