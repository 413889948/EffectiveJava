package com.demo.p4p7;

/**
 * @Author 黄祎翔
 * @Time 2021/2/25 10:47
 * @ClassName JavaBean
 * @Description
 */
public class JavaBean {
    private static JavaBean javaBean = new JavaBean();
    private int id;

    public static JavaBean getInstance(int id) {
        javaBean.id = id;
        return javaBean;
    }

    public static JavaBean newInstance(int id) {
        JavaBean javaBean = new JavaBean();
        javaBean.id = id;
        return javaBean;
    }

    public static JavaBean getJavaBean() {
        return javaBean;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
            "id=" + id +
            '}';
    }
}
