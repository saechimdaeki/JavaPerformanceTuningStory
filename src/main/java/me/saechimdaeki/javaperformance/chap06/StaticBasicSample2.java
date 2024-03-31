package me.saechimdaeki.javaperformance.chap06;

public class StaticBasicSample2 {
    static String staticVal;
    static {
        staticVal = "Static Value";
        staticVal = StaticBasicSample.staticInt+"";
    }

    public static void main(String[] args) {
        System.out.println(StaticBasicSample2.staticVal);
    }

    static {
        staticVal = "Performance is important !!";
    }
}
