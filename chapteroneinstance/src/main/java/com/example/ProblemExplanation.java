package com.example;

public class ProblemExplanation {
    public static void main(String args[]){
        System.out.print("写一个影片出租店用的程序，计算每一位顾客的消费并打印详单。" +
                "\n操作者告诉程序：顾客租了哪些影片、租期多长、程序变根据租赁时间和影片类型计算费用" +
                "\n影片分为三类：普通、儿童、新片" +
                "\n除了计算费用还要为常客计算积分，积分会根据租片类型是否为新片而不同" +
                "\n费用细则：普通-2，超过两天则(天数-2)*1.5、新片-天数*3、儿童片-1.5，超过三天则(天数-3)*1.5" +
                "\n积分细则：新片+2，其余+1");
    }
}
