package io.codelex.collections.practice.phonebook;

import java.util.Arrays;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data;
    private int dataCount;

    public PhoneDirectory() {
        data = new TreeMap<String, String>();
        dataCount = 0;
    }

    private int find(String name) {
        if (data.containsKey(name)) {
            return 1;
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return data.get(name);
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            data.putIfAbsent(name, number);
        } else {
            data.put(name, number);
            dataCount++;
        }
    }

}
