package com.example.consumer.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<LinkedHashMap> itemList = new ArrayList<>();
        LinkedHashMap h = new LinkedHashMap();
        h.put("1", "1");
        h.put("weight", "1");
        LinkedHashMap h1 = new LinkedHashMap();
        h1.put("1", "1");
        h1.put("weight", 1);
        LinkedHashMap h2 = new LinkedHashMap();
        h2.put("1", "1");
        h2.put("weight", null);
        itemList.add(h);
        itemList.add(h1);
        itemList.add(h2);
        for (LinkedHashMap item : itemList) {
            System.out.println(isNumber(item.get("weight")));
        }
    }

    //判断是否可以转换成数数字
    public static Integer isNumber(Object obj) {
        Integer weight = 0;
        try {
            if (obj instanceof Integer) {
                weight = (Integer) obj;
                return weight;
            } else if (obj instanceof String) {
                weight = Integer.parseInt((String) obj);
                return weight;
            }
        } catch (Exception e){
            System.out.println("类型转换错误!");
        }
        return weight;
    }

}
