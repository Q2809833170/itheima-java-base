package com.itheima.demo01;

public class ValueDemo2 {
    public static void main(String[] args) {
        //变量

        //1.定义变量，输出
        int a = 10;
        System.out.println(a);//10

        //2.变量参与计算
        int b = 30;
        int c = 20;
        System.out.println(b+c);

        //3.修改变量记录的值
        a = 50;
        System.out.println(a);//50

        System.out.println("--------------------");
        //注意事项:
        //1.只能存一个值
        //2.变量名不允许重复定义
        //3.一条语句可以定义多个变量
        int d = 10, e = 20, f = 30;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //4.变量在使用之前一定要进行赋值
        int g;
        g = 100;
        System.out.println(g);


    }
}
