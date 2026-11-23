package com.itheima.arithmeticoperator;

public class ArithmeticOperatorDemo3 {
    public static void main(String[] args) {
        //隐式转换(自动类型提升)
        //就是把一个取值范围小的数据或者变量，赋值给另一个取值范围大的变量。

        //规则:
        //1.取值范围小的和取值范围大的进行运算,小的会先提升为大的在计算
        //2.byte,short,char三种数据类型在运算的时候,都会直接先提升为int,在进行计算


        //取值范围从小到大的关系
        //byte < short < int < long < float < double

        System.out.println("案例一:");

        double d = 10;
        System.out.println(d);//10.0,double
        System.out.println("数据类型是:double");

        System.out.println("案例二:");

        byte b = 100;//byte的取值范围-128~127
        System.out.println(b);//100
        System.out.println("数据类型是:int");

        System.out.println("案例三:");

        int i = 10;
        long n = 20L;
        long result0 = i + n;
        System.out.println(result0);//long类型
        System.out.println("数据类型是:long");

        System.out.println("案例四:");

        int p = 10;
        long q = 100L;
        double r = 20.0;
        double result1 = p + q + r;
        System.out.println(result1);//double类型
        System.out.println("数据类型是:double");

        System.out.println("案例五:");

        byte e1 = 10;
        byte e2 = 20;
        int e3 = e1 + e2;
        System.out.println(e3);
        System.out.println("数据类型是:int");

        System.out.println("案例六:");

        byte c1 = 10;
        short c2 = 20;
        long c3 = 100L;
        long result2 = c1 + c2 + c3;
        System.out.println(result2);
        System.out.println("数据类型是:long");

        System.out.println("=========================");
        System.out.println("案例七:");
        System.out.println("强制转换");

        double a1 = 12.3;
        int a2 = (int) a1;
        System.out.println(a2);
        System.out.println("数据类型是:int");

        System.out.println("案例八:");
        System.out.println("强制转换");

        byte b1 = 10;
        byte b2 = 20;

        byte result = (byte) (b1 + b2);
        System.out.println(result);//30
        System.out.println("数据类型是:byte");

    }
}



