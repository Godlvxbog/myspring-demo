package com.hw;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class HashMapTest {
    public static void main(String[] args) {
        testHahsMap();

        testStack();
    }

    private static void testHahsMap(){
        Map<String,String> map = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            map.put(String.valueOf(i),String.valueOf(i*i));
        }

        for (String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }

    private static void testStack(){
        Stack<String> stack = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            stack.push(String.valueOf(i));
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
