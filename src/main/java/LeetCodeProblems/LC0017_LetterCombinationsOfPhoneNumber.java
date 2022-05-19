package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LC0017_LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
        List<String> res = new ArrayList<>();
        if (digits.length() > 0)
            backtrack(map, res, new StringBuilder(), digits, 0);
        return res;
    }

    private void backtrack(Map<Character, String> map, List<String> comb, StringBuilder sb, String digits, int p) {
        if (p == digits.length()) {
            comb.add(sb.toString());
            return;
        }

        String letters = map.get(digits.charAt(p));
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backtrack(map, comb, sb, digits, p + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
