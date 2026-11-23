package com.itheima.demo01;
//需求：说出公交车到终点站之后，车上一共有多少乘客？
//一开始没有乘客。
//第一站：上去一位乘客，没有下来乘客。
//第二站：上去两位乘客，下来一位乘客。
//第三站：上去两位乘客，下来一位乘客。
//第四站：没有上去乘客，下来一位乘客。
//第五站：上去一位乘客，没有下来乘客。
//问：到了终点站之后，车上一共多少乘客？
public class ValueTest {
    public static void main(String[] args) {
        //一开始没有乘客
        int count = 0;
        //第一站
        count += 1;
        //第二站
        count = count + 2 - 1;
        //第三站
        count = count + 2 - 1;
        //第四站
        count = count - 1;
        //第五站
        count = count + 1;
        System.out.println("终点站之后，车上共有" + count + "位乘客");
    }
}
