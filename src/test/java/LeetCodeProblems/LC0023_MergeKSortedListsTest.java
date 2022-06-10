package LeetCodeProblems;

import LeetCodeCommons.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0023_MergeKSortedListsTest {
    private LC0023_MergeKSortedLists sol;

    @BeforeEach
    void setUp() {
        sol = new LC0023_MergeKSortedLists();
    }

    void mergeKListsTest0(ListNode[] lists, List<Integer> expected) {
        ListNode res = sol.mergeKLists(lists);
        assertIterableEquals(expected, ListNode.toList(res));
    }

    void mergeKListsTest1(ListNode[] lists, List<Integer> expected) {
        ListNode res1 = sol.mergeKLists1(lists);
        assertIterableEquals(expected, ListNode.toList(res1));
    }

    @Test
    void mergeKLists01() {
        ListNode[] lists = {
                ListNode.fromList(Arrays.asList(1, 4, 5)),
                ListNode.fromList(Arrays.asList(1, 3, 4)),
                ListNode.fromList(Arrays.asList(2, 6))
        };
        List<Integer> expected = List.of(1, 1, 2, 3, 4, 4, 5, 6);
        mergeKListsTest0(lists, expected);
    }

    @Test
    void mergeKLists02() {
        ListNode[] lists = {};
        List<Integer> expected = List.of();
        mergeKListsTest0(lists, expected);
    }

    @Test
    void mergeKLists03() {
        ListNode[] lists = {null};
        List<Integer> expected = List.of();
        mergeKListsTest0(lists, expected);
    }

    @Test
    void mergeKLists11() {
        ListNode[] lists = {
                ListNode.fromList(Arrays.asList(1, 4, 5)),
                ListNode.fromList(Arrays.asList(1, 3, 4)),
                ListNode.fromList(Arrays.asList(2, 6))
        };
        List<Integer> expected = List.of(1, 1, 2, 3, 4, 4, 5, 6);
        mergeKListsTest1(lists, expected);
    }

    @Test
    void mergeKLists12() {
        ListNode[] lists = {};
        List<Integer> expected = List.of();
        mergeKListsTest1(lists, expected);
    }

    @Test
    void mergeKLists13() {
        ListNode[] lists = {null};
        List<Integer> expected = List.of();
        mergeKListsTest1(lists, expected);
    }
}