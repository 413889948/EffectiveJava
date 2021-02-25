package com.demo.p15p16;


/**
 * @Author 黄祎翔
 * @Time 2021/2/25 10:22
 * @ClassName Main
 * @Description 静态方法设定无法被实例化
 */
public class Main {
    /**
     * 在使用如工具类时，经常会出现需要在工具内使用静态方法，要求使用时只能直接调用静态方法的情况，
     * 因此这种类是不应该能被实例化的，采用的解决方法是：将类构造器私有化的方式解决这一问题
     */
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        TestUtil.test();
    }
}
