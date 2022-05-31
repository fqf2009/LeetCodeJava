package LeetCodeProblems;

public class LC0012_IntToRoman {
    public String intToRoman(int num) {
        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (num > 0) {
            while (values[i] > num) i += 1;
            num -= values[i];
            res.append(symbols[i]);
        }
        return res.toString();
    }
}
