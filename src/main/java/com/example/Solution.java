package com.example;

import java.util.*;

public class Solution {
    public Map<String, Integer> flattenMap(Map<String, Object> map) {
        Map<String, Integer> map1 = new HashMap<>();
        helper(map, map1, "");
        return map1;
    }

    private void helper(Map<String, Object> input, Map<String, Integer> output, String name) {
        for (Map.Entry<String, Object> entry : input.entrySet()) {
            Map<String, Integer> temp = new HashMap<>();
            if (entry.getValue() instanceof Map) {
                helper((Map<String, Object>) entry.getValue(), temp, name + entry.getKey() + ".") ;
                output.putAll(temp);
            } else {
                output.put(name + entry.getKey(), (Integer) entry.getValue());
            }
        }
    }
}
