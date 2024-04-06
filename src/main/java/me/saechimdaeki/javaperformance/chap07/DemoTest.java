package me.saechimdaeki.javaperformance.chap07;

public class DemoTest {
    public static void main(String[] args) {
        DemoClass dc = new DemoClass();
        DemoTest dt = new DemoTest();
        dt.getClassInfos(dc);
    }

    public void getClassInfos(Object clazz) {
        Class demoClass = clazz.getClass();
        getClassInfos(demoClass);
    }

    public void getClassInfo(Class demoClass) {
        String className = demoClass.getName();
        System.out.format("class Name: %S\n", className);
        String classCanonicalName = demoClass.getCanonicalName();
        System.out.format("class Canonical Name: %S\n", classCanonicalName);
        String classSimpleName = demoClass.getSimpleName();
        System.out.format("class Simple Name: %S\n", classSimpleName);
        String packageName = demoClass.getPackage().getName();
        System.out.format("class Package Name: %S\n", packageName);
        String toString = demoClass.toString();
        System.out.format("class toString: %S\n", toString);
    }
}
