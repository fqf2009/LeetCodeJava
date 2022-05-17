package LeetCodeProblems;

import java.util.*;

public class LC0380_InsertDeleteGetRandom {
    private final Map<Integer, Integer> map;
    private final List<Integer> list;

    public LC0380_InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int i = map.get(val);
        if (i < list.size() - 1) {
            int v1 = list.get(list.size() - 1);
            map.replace(v1, i);
            list.set(i, v1);
        }
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get((int) (Math.random() * list.size()));
    }
}
