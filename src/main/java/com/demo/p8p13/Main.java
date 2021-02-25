package com.demo.p8p13;

/**
 * @Author 黄祎翔
 * @Time 2021/2/25 10:22
 * @ClassName Main
 * @Description
 */
public class Main {
    /**
     * 使用这种建造者类可以将对应javaBean内的属性设定为不可变属性，
     * 并且可以避免出现多个set的繁琐情况，可读性更强
     */
    public static void main(String[] args) {
        // 使用建造者模式创建javaBean对象
        JavaBean javaBean = new JavaBean.Builder(1).str("一").str2("二").build();
        System.out.println(javaBean.getId());
        System.out.println(javaBean.getStr());
        System.out.println(javaBean.getStr2());

    }
}
