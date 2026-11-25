package com.itheima.logicoperator;

public class LogicOperatorDemo3 {
    public static void main(String[] args) {
        //1.&& 短路与
        //两边都为真,结果才是真
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false
        //2.|| 短路或
        //两边都为假,结果才是假
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        //3.短路逻辑运算
        //&&:左边为假,右边不执行
        //||:左边为真,右边不执行
        int a = 10;
        int b = 20;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//20

    }
}
