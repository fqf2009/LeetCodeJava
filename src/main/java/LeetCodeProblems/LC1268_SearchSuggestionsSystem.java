package LeetCodeProblems;

import java.util.*;

public class LC1268_SearchSuggestionsSystem {
    // Sort + TreeMap
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        List<String> prodList = Arrays.stream(products).sorted().toList();
        for (int i = 0; i < prodList.size(); i++) {
            map.put(prodList.get(i), i);
        }

        String prefix = "";
        for (var ch : searchWord.toCharArray()) {
            prefix += ch;
            Map.Entry<String, Integer> start = map.ceilingEntry(prefix);
            Map.Entry<String, Integer> end = map.floorEntry(prefix + "~");
            if (start == null || end == null) break;
            res.add(prodList.subList(start.getValue(), Integer.min(start.getValue() + 3, end.getValue() + 1)));
        }

        while (res.size() < searchWord.length()) {
            res.add(new ArrayList<>());
        }

        return res;
    }

    // TreeSet
    public List<List<String>> suggestedProducts1(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>(Arrays.asList(products));

        String prefix = "";
        for (var ch : searchWord.toCharArray()) {
            prefix += ch;
            List<String> suggest = new ArrayList<>();
            String key = set.ceiling(prefix);
            while (suggest.size() < 3 && key != null && key.startsWith(prefix)) {
                suggest.add(key);
                key = set.higher(key);
            }
            res.add(suggest);
        }

        return res;
    }

    public List<List<String>> suggestedProducts2(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>(Arrays.asList(products));

        String prefix = "";
        for (var ch : searchWord.toCharArray()) {
            prefix += ch;
            List<String> suggest = new ArrayList<>();
            var iter = set.tailSet(prefix).iterator();
            while (suggest.size() < 3 && iter.hasNext()) {
                var prod = iter.next();
                if (prod.startsWith(prefix)) {
                    suggest.add(prod);
                }
            }
            res.add(suggest);
        }

        return res;
    }
}
