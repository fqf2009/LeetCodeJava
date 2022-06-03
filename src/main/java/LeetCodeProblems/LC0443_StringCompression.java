package LeetCodeProblems;

public class LC0443_StringCompression {
    private int fill(char ch, int cnt, int pos, char[] chars) {
        chars[pos++] = ch;
        if (cnt > 1)
            for (var ch1 : String.valueOf(cnt).toCharArray())
                chars[pos++] = ch1;
        return pos;
    }

    public int compress(char[] chars) {
        int pos = 0, cnt = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                cnt++;
            } else {
                pos = fill(chars[i - 1], cnt, pos, chars);
                cnt = 1;
            }
        }
        return fill(chars[chars.length - 1], cnt, pos, chars);
    }
}
