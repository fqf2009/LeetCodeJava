package LeetCodeProblems;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Comparator;

public class LC1405_LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        SimpleEntry<Integer, Character>[] arr = new SimpleEntry[3];
        arr[0] = new SimpleEntry<>(a, 'a');
        arr[1] = new SimpleEntry<>(b, 'b');
        arr[2] = new SimpleEntry<>(c, 'c');
        StringBuilder sb = new StringBuilder();
        while (true) {
            // Arrays.sort(arr, (x, y) -> x.getKey() - y.getKey());
            Arrays.sort(arr, Comparator.comparingInt(SimpleEntry::getKey));
            int n = sb.length();
            int i = n >= 2 && sb.charAt(n - 1) == sb.charAt(n - 2) &&
                    sb.charAt(n - 1) == arr[2].getValue() ? 1 : 2;
            if (arr[i].getKey() == 0) break;
            sb.append(arr[i].getValue());
            arr[i] = new SimpleEntry<>(arr[i].getKey() - 1, arr[i].getValue());
        }
        return sb.toString();
    }
}
