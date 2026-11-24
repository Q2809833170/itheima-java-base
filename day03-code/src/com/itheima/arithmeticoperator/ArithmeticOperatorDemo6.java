package com.itheima.arithmeticoperator;

public class ArithmeticOperatorDemo6 {
    public static void main(String[] args) {
        int x = 10;
        //后++:先用后加
        //表示先把变量x里面的值赋值给y，然后再把变量x里面的值+1
        int y = x++;//x = 11, y = 10
        //先++:先加后用
        //表示先把变量x里面的值+1，然后再把变量x里面的值赋值给z
        int z = ++x;//x = 12, z = 12
        System.out.println("x = " + x);//12
        System.out.println("y = " + y);//10
        System.out.println("z = " + z);//12
    }
}
