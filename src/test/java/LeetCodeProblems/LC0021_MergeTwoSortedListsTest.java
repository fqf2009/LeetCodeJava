package LeetCodeProblems;

import LeetCodeCommons.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0021_MergeTwoSortedListsTest {
    private LC0021_MergeTwoSortedLists solution;

    void mergeTwoListsTest(List<Integer> list1, List<Integer> list2, List<Integer> expected) {
        ListNode head1 = ListNode.createNodeList(list1);
        ListNode head2 = ListNode.createNodeList(list2);
        ListNode head3 = solution.mergeTwoLists(head1, head2);
        System.out.println(head3);
        if (expected.size() == 0) {
            assertNull(head3);
        } else {
            assertIterableEquals(expected, head3);
        }
    }

    @BeforeEach
    void setup() {
        solution = new LC0021_MergeTwoSortedLists();
    }

    @Test
    void mergeTwoListsTestCase1() {
        mergeTwoListsTest(Arrays.asList(1, 2, 4), Arrays.asList(1, 3, 4), Arrays.asList(1, 1, 2, 3, 4, 4));
    }

    @Test
    void mergeTwoListsTestCase2() {
        mergeTwoListsTest(Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Test
    void mergeTwoListsTestCase3() {
        mergeTwoListsTest(Collections.EMPTY_LIST, Arrays.asList(0), Arrays.asList(0));
        mergeTwoListsTest(Arrays.asList(0), Collections.EMPTY_LIST, Arrays.asList(0));
    }
}
