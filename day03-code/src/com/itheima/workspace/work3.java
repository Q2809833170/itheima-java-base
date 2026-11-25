package com.itheima.workspace;

//某小伙想定一份外卖，商家的优惠方式如下：
//鱼香肉丝单点24元,油炸花生米单点8元，米饭单点3元。
//订单满30元8折优惠。
//鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
//那么这个小伙要点这三样东西，最少要花多少钱？
public class work3 {
    public static void main(String[] args) {
        //1.定义三样东西的价格
        double fish_price = 24.0;
        double peanut_price = 8.0;
        double rice_price = 3.0;
        //2.方案一:订单满三十元
        double total_price1 = (fish_price + peanut_price + rice_price) * 0.8;
        //3.方案二:优惠价
        double fish_price1 = 16.0;
        double total_price = fish_price1 + peanut_price + rice_price;
        //4.比较两种方案的价格
        double result_total_price = total_price > total_price1 ? total_price : total_price1;
        //输出结果
        System.out.println("最少要花:"+result_total_price+"元");
    }
}
