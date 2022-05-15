package LeetCodeProblems;

public class LC2264_LargestGoodInteger {
    public String largestGoodInteger(String num) {
        String res = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                if (res.length() == 0 || res.charAt(0) < num.charAt(i)) {
                    res = num.substring(i, i + 3);
                }
            }
        }
        return res;
    }
}
