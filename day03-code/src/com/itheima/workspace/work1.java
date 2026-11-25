package com.itheima.workspace;

import java.util.Scanner;

//身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//
//儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
public class work1 {
    public static void main(String[] args) {
        //1.先定义子女的各自身高
        double son_weight, girl_weight;
        //2.获取父母的身高
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入父亲的身高:");
        double father_weight = sc.nextDouble();
        System.out.println("请输入母亲的身高:");
        double mother_weight = sc.nextDouble();
        //3.根据子女身高与父母身高的关系
        son_weight = (father_weight + mother_weight) * 1.08 / 2;
        girl_weight = (father_weight - 0.923 + mother_weight) / 2;
        //4.输出结果
        System.out.printf("儿子的身高预计"+son_weight+"cm");
        System.out.println("女儿的身高预计"+girl_weight+"cm");
    }
}
