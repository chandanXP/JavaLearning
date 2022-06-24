package com.company;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1 , 2);
        map.put(2, 4);
        map.put(4, 8);
        map.put(8, 16);

        map.put(4, 8+1);

        //System.out.println(map.get(4));
        System.out.println(map.containsKey(2));
        for(java.util.Map.Entry e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
