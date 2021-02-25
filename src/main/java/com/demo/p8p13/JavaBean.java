package com.demo.p8p13;

/**
 * @Author 黄祎翔
 * @Time 2021/2/25 9:56
 * @ClassName JavaBean
 * @Description 代表普通javabean类
 */
public class JavaBean {
    private final int id;
    private final String str;
    private final String str2;


    public static class Builder {
        private final int id;
        private  String str;
        private  String str2;

        public Builder(int id) {
            this.id = id;
        }

        public Builder str(String v) {
            str = v;
            return this;
        }

        public Builder str2(String v) {
            str2 = v;
            return this;
        }

        public  JavaBean build() {
            return new JavaBean(this);
        }

    }

    public int getId() {
        return id;
    }

    public String getStr() {
        return str;
    }

    public String getStr2() {
        return str2;
    }

    private JavaBean(Builder builder) {
        this.id = builder.id;
        this.str = builder.str;
        this.str2 = builder.str2;
    }



}
