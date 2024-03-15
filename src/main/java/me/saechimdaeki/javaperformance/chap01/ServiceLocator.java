package me.saechimdaeki.javaperformance.chap01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;

public class ServiceLocator {
    private InitialContext ic;
    private Map cache;
    private static ServiceLocator me;

    static {
        me = new ServiceLocator();
    }

    private ServiceLocator() {
        cache = Collections.synchronizedMap(new HashMap<>());
    }

    public InitialContext getInitialContext() throws Exception {
        try {
            if (ic == null) {ic = new InitialContext();}
        } catch (Exception e) {
            throw e;
        }
        return ic;
    }

    public static ServiceLocator getInstance() {
        return me;
    }
}
