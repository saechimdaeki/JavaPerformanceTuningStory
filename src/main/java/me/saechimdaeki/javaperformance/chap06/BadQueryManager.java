package me.saechimdaeki.javaperformance.chap06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BadQueryManager {
    private static String queryURL = null;
    private static ObjectMapper objectMapper = new ObjectMapper();
    public BadQueryManager(String badUrl) {
        queryURL = badUrl;
    }

    public static String getSql(String idSql) {
        try (BufferedReader reader = new BufferedReader(new FileReader(queryURL))) {
            Map<String,String> document = objectMapper.readValue(reader.readLine(), Map.class);
            return document.get(idSql);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
