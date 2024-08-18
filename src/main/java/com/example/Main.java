package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> map = Map.ofEntries(
                Map.entry("a", 1),
                Map.entry("b", Map.ofEntries(
                        Map.entry("c", 2),
                        Map.entry("d", 3))
                ),
                Map.entry("e", 4),
                Map.entry("r", Map.ofEntries(
                        Map.entry("f", 5),
                        Map.entry("g", 6),
                        Map.entry("h",
                                Map.ofEntries(
                                        Map.entry("j", 7)
                                )
                        )
                )
        ));
        Map<String, Integer> m = new Solution().flattenMap(map);
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}