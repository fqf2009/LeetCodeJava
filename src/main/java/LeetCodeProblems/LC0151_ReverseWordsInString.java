package LeetCodeProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC0151_ReverseWordsInString {
    public String reverseWords(String s) {
        // immutable list!
        // List<String> list = Arrays.stream(s.split(" ")).toList();
        // list.forEach((a) -> new StringBuilder(s).reverse().toString());
        // Collections.reverse(list);
        List<String> list = Arrays.stream(s.split("\s+"))
                .filter((a) -> a.trim().length() > 0)
                .collect(Collectors.toList());
        Collections.reverse(list);
        return String.join(" ", list);
    }
}
