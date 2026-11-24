package com.itheima.compareoperator;

public class CompareOperatorDemo1 {
    public static void main(String[] args) {
        //比较运算符:==, !=, >, <, >=, <=
        //关系运算符的结果都是boolean类型,结果只有true和false

        //1.== 判断左右两边是否相等
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b); // true
        System.out.println(a == c); // false

        //2.!= 判断左右两边是否不相等
        System.out.println(a != b); // false
        System.out.println(a != c); // true

        //3.> 判断左边是否大于右边
        System.out.println(a > b); // false
        System.out.println(a > c); // false

        //4.< 判断左边是否小于右边
        System.out.println(a < b); // false
        System.out.println(a < c); // true

        //5.>= 判断左边是否大于等于右边
        System.out.println(a >= b); // true
        System.out.println(a >= c); // false

        //6.<= 判断左边是否小于等于右边
        System.out.println(a <= b); // true
        System.out.println(a <= c); // true

    }
}
