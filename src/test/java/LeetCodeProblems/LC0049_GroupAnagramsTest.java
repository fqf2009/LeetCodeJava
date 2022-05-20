package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {
    @Override
    public int compare(List<T> o1, List<T> o2) {
        for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
            int c = o1.get(i).compareTo(o2.get(i));
            if (c != 0) {
                return c;
            }
        }
        return Integer.compare(o1.size(), o2.size());
    }
}

class LC0049_GroupAnagramsTest {
    LC0049_GroupAnagrams sol;

    @BeforeEach
    void setUp() {
        sol = new LC0049_GroupAnagrams();
    }

    void groupAnagramsTest(String[] strs, List<List<String>> expected) {
        List<List<String>> res = sol.groupAnagrams(strs);
        for (var list : res) {
            //list.sort((s1, s2) -> s1.compareTo(s2));
            // list.sort(String::compareTo);
            list.sort(Comparator.naturalOrder());
        }
        res.sort(new ListComparator<>());
        assertIterableEquals(expected, res);

        res = sol.groupAnagrams1(strs);
        for (var list : res) {
            list.sort(Comparator.naturalOrder());
        }
        res.sort(new ListComparator<>());
        assertIterableEquals(expected, res);
    }

    @Test
    void groupAnagramsTest1() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(List.of("ate", "eat", "tea"), List.of("bat"), List.of("nat", "tan"));
        groupAnagramsTest(input, expected);
    }

    @Test
    void groupAnagramsTest2() {
        String[] input = {"ddddddddddg", "dgggggggggg"};
        List<List<String>> expected = List.of(List.of("ddddddddddg"), List.of("dgggggggggg"));
        groupAnagramsTest(input, expected);
    }

    @Test
    void groupAnagramsTest3() {
        String[] input = {""};
        List<List<String>> expected = List.of(List.of(""));
        groupAnagramsTest(input, expected);
    }

    @Test
    void groupAnagramsTest4() {
        String[] input = {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        groupAnagramsTest(input, expected);
    }
}