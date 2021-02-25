package com.demo.p4p7;


/**
 * @Author 黄祎翔
 * @Time 2021/2/25 10:22
 * @ClassName Main
 * @Description 静态工厂替代构造器
 */
public class Main {
    /**
     * 使用静态工厂替代构造器，可以较为灵活，自定义命名，唯一对象等优点
     */
    public static void main(String[] args) {
        //获取静态工厂内的javaBean对象，内部属性调配非常灵活
        JavaBean instance = JavaBean.getInstance(2);
        System.out.println(instance);
        JavaBean instance1 = JavaBean.getInstance(2);
        instance1.setId(1);
        System.out.println(instance);
        //新建一个静态工厂内对象
        JavaBean javaBean = JavaBean.newInstance(3);
        System.out.println(javaBean);
    }
}
