package LeetCodeProblems;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC1405_LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        SimpleEntry<Character, Integer>[] arr = new SimpleEntry[3];
        arr[0] = new SimpleEntry<>('a', a);
        arr[1] = new SimpleEntry<>('b', b);
        arr[2] = new SimpleEntry<>('c', c);
        StringBuilder sb = new StringBuilder();
        while (true) {
            // Arrays.sort(arr, (x, y) -> x.getValue() - y.getValue());
            Arrays.sort(arr, Comparator.comparingInt(SimpleEntry::getValue));
            int n = sb.length();
            int i = n >= 2 && sb.charAt(n - 1) == sb.charAt(n - 2) &&
                    sb.charAt(n - 1) == arr[2].getKey() ? 1 : 2;
            SimpleEntry<Character, Integer> ent = arr[i];
            if (ent.getValue() == 0) break;
            sb.append(ent.getKey());
            ent.setValue(ent.getValue() - 1);
        }
        return sb.toString();
    }

    public String longestDiverseString1(int a, int b, int c) {
        List<SimpleEntry<Character, Integer>> list = new ArrayList<>();
        list.add(new SimpleEntry<>('a', a));
        list.add(new SimpleEntry<>('b', b));
        list.add(new SimpleEntry<>('c', c));
        StringBuilder sb = new StringBuilder();
        while (true) {
            // list.sort((x, y) -> x.getValue() - y.getValue());
            list.sort(Comparator.comparingInt(SimpleEntry::getValue));
            int n = sb.length();
            int i = (n >= 2 && sb.charAt(n - 1) == sb.charAt(n - 2)
                     && sb.charAt(n - 1) == list.get(2).getKey()) ? 1 : 2;
            SimpleEntry<Character, Integer> ent = list.get(i);
            if (ent.getValue() == 0) break;
            sb.append(ent.getKey());
            ent.setValue(ent.getValue() - 1);
        }
        return sb.toString();
    }
}
