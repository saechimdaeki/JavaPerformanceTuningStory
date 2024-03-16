package me.saechimdaeki.javaperformance.chap02;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GetProperties {

    public static void main(String[] args) {
        System.getProperty("JavaTuning", "Tune SAECHIM");
        Properties prop = System.getProperties();
        Set<Object> key = prop.keySet();
        Iterator<Object> it = key.iterator();
        while (it.hasNext()) {
            String curKey = it.next().toString();
            System.out.format("%s=%s\n", curKey, prop.getProperty(curKey));
        }
    }
}
