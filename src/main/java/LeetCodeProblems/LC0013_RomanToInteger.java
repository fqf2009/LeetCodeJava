package LeetCodeProblems;

import java.util.Map;

public class LC0013_RomanToInteger {
    public int romanToInt(String s) throws Exception {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "III", "II", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 3, 2, 1};
        int i = 0, j = 0, res = 0;
        while (i < s.length()) {
            try {
                while (!s.startsWith(symbols[j], i)) j++;
            } catch (Exception e) {
                throw new Exception("Invalid roman number: " + s);
            }
            res += values[j];
            i += symbols[j].length();
        }
        return res;
    }

    public int romanToInt1(String s) {
        Map<Character, Integer> roman = Map.of('M', 1000, 'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I', 1);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int v = roman.get(s.charAt(i));
            res += i + 1 < s.length() && v < roman.get(s.charAt(i + 1)) ? -v : v;
        }
        return res;
    }
}
