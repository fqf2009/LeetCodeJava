package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0166_FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        long r = numerator, d = denominator;
        List<String> res = new ArrayList<>();
        if (r * d < 0) res.add("-");
        r = r < 0 ? -r : r;
        d = d < 0 ? -d : d;

        res.add(Long.toString(r / d));
        r = (r % d) * 10;
        Map<Long, Integer> recur = new HashMap<>();
        if (r > 0) res.add(".");
        while (r > 0) {
            recur.put(r, res.size());
            res.add(Long.toString(r / d));
            r = (r % d) * 10;
            if (recur.containsKey(r)) {
                int recur_pos = recur.get(r);
                return String.join("", res.subList(0, recur_pos)) + "(" +
                        String.join("", res.subList(recur_pos, res.size())) + ")";
            }
        }
        return String.join("", res);
    }

    public String fractionToDecimal1(int numerator, int denominator) {
        long r = numerator, d = denominator;
        StringBuilder res = new StringBuilder();
        if (r * d < 0) res.append("-");
        r = r < 0 ? -r : r;
        d = d < 0 ? -d : d;

        res.append(r / d);
        r = (r % d) * 10;
        Map<Long, Integer> recur = new HashMap<>();
        if (r > 0) res.append(".");
        while (r > 0) {
            recur.put(r, res.length());
            res.append(r / d);
            r = (r % d) * 10;
            if (recur.containsKey(r)) {
                res.insert(recur.get(r), "(");
                res.append(")");
                break;
            }
        }
        return res.toString();
    }
}
