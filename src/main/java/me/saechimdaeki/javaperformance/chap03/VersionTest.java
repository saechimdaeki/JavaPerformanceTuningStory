package me.saechimdaeki.javaperformance.chap03;

public class VersionTest {
    public VersionTest() {
        str = "Here is a sample.";
        int i = 1;
        String str2 = (new StringBuilder("Here is"))
                .append(i).append(" samples.").toString();
    }
    String str;
}
