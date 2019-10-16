package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MyCalendar {

    private TreeMap<Integer, Integer> map = new TreeMap<>();

    public boolean book(int s, int e) {
        map.put(s, map.getOrDefault(s, 0) + 1);
        map.put(e, map.getOrDefault(e, 0) - 1);

        int cnt = 0, k = 0;
        for (int v : map.values()) {
            k = Math.max(k, cnt += v);
            if (k > 1) {
                map.put(s, map.get(s) - 1);
                map.put(e, map.get(e) + 1);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */