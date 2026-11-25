package com.itheima.logicoperator;

public class LogicOperatorDemo1 {
    public static void main(String[] args) {
        //1.& 并且
        //两边都为真,结果才是真
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&true);//false
        System.out.println(false&false);//false
        //2.| 或者
        //两边都为假,结果才是假
        System.out.println(true|true);//true
        System.out.println(true|false);//true
        System.out.println(false|true);//true
        System.out.println(false|false);//false
    }
}
