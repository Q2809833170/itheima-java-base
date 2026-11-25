package com.itheima.workspace;
//红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
//绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
//那么红茶和绿茶现在的钱一样多，请问对么？
public class work2 {
    public static void main(String[] args) {
        //1.先定义两位妹妹原来钱的数量
        int red_wallet = 21;
        int green_wallet = 24;
        //2.在计算两位几天后的钱
        int red_wallet_current = red_wallet*2+3;
        int green_wallet_current = green_wallet*2;
        //3.三元运算符判断
        String result=red_wallet_current==green_wallet_current?"钱一样多":"钱不一样多";
        //4.输出结果
        System.out.println(result);
    }
}
