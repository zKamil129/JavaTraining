package org.example;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Andrew", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Pies", 4441);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Pises"));

        System.out.println(empIds.containsValue(444));
        empIds.put("Andrew", 33333);
        System.out.println(empIds);

        empIds.replace("Andrew", 3312341);
        System.out.println(empIds);

        empIds.putIfAbsent("John", 2231);
        empIds.putIfAbsent("Pies", 2231);
        System.out.println(empIds);

        empIds.remove("John");
        System.out.println(empIds);
    }
}
