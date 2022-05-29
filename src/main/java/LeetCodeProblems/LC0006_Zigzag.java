package LeetCodeProblems;

import java.util.Arrays;

public class LC0006_Zigzag {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int rn = 0, direction = 1;
        for (char ch : s.toCharArray()) {
            sb[rn].append(ch);
            rn += direction;
            if (rn == 0 || rn == numRows - 1)
                direction *= -1;
        }
        //return String.join("", Arrays.stream(sb).map(StringBuilder::toString).toList());
        return String.join("", sb);
    }
}
