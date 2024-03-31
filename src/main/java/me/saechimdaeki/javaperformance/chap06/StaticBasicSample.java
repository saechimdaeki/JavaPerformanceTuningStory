package me.saechimdaeki.javaperformance.chap06;

public class StaticBasicSample {
    public static int staticInt = 0;

    public static void main(String[] args) {
        StaticBasicSample sbs1 = new StaticBasicSample();
        sbs1.staticInt++;

        StaticBasicSample sbs2 = new StaticBasicSample();
        sbs2.staticInt++;

        System.out.println(sbs1.staticInt);
        System.out.println(sbs2.staticInt);

        System.out.println(StaticBasicSample.staticInt);
    }
}
