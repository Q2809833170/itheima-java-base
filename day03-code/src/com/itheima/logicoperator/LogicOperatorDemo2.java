package com.itheima.logicoperator;

public class LogicOperatorDemo2 {
    public static void main(String[] args) {
        //1.^ 异或
        //两边相同,结果为假;两边不同,结果为真
        System.out.println(true^true);//false
        System.out.println(true^false);//true
        System.out.println(false^true);//true
        System.out.println(false^false);//false
        //2.! 非
        //取反,真变假,假变真
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}
