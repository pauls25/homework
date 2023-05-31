package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List<String> listArray = Arrays.asList(array);
        System.out.println(listArray);

        Set<String> myHashSet = new HashSet<>(listArray);
        System.out.println(myHashSet);

        Map<String, String> myHashMap = new HashMap<String, String>();
        
        String[] brands = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Tesla"};
        String[] origins = {"Germany", "Germany", "Japan", "Germany", "Germany", "USA"};

        for (int i = 0; i < brands.length; i++) {
            String brand = brands[i];
            String origin = origins[i];
            myHashMap.put(brand, origin);
        }
        System.out.println(myHashMap);
    }
}
