package com.itheima.test;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(3.7+"abc");//"3.7abc"
        System.out.println("abc"+true);//"abctrue"
        System.out.println('中'+"abc"+true);//"中abctrue"

        int age = 18;
        System.out.println("我的年龄是"+age+"岁");//"我的年龄是18岁"
        System.out.println("我的年龄是"+"age"+"岁");//"我的年龄是age岁"
        System.out.println(1+2+"abc"+2+1);//"3abc21"
    }
}
