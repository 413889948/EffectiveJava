package com.demo.p8p13;

/**
 * @Author 黄祎翔
 * @Time 2021/2/25 10:22
 * @ClassName Main
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        // 使用建造者模式创建javaBean对象
        JavaBean javaBean = new JavaBean.Builder(1).str("一").str2("二").build();
        System.out.println(javaBean.getId());
        System.out.println(javaBean.getStr());
        System.out.println(javaBean.getStr2());
    }
}
