package com.itheima.assigningoperator;

public class AssigningOperatorDemo1 {
    public static void main(String[] args) {
        //赋值运算符
        //+=
        int a = 10;
        int b = 20;
        a += b; // a = a + b
        System.out.println(a); // 30
        //-=
        int c = 10;
        int d = 20;
        c -= d; // c = c - d
        System.out.println(c); // -10
        // *=
        int e = 10;
        int f = 20;
        e *= f; // e = e * f
        System.out.println(e); // 200
        // /=
        int g = 10;
        int h = 20;
        g /= h; // g = g / h
        System.out.println(g); // 0
        // %=
        int i = 10;
        int j = 20;
        i %= j; // i = i % j
        System.out.println(i); // 10

        //细节:
        //+=, -=, *=, /=, %= 这些运算符的左边和右边的数据类型必须一致,计算机底层进行了强制类型转换
        short s = 1;
        s += 1;//s = (short)(s + 1);
        System.out.println(s);//2


    }
}
