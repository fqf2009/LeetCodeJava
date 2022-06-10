package LeetCodeProblems;

import LeetCodeCommons.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC0002_AddTwoNumbersTest {
    private LC0002_AddTwoNumbers solution;

    @BeforeEach
    void setUp() {
        solution = new LC0002_AddTwoNumbers();
    }

    void addTwoNumbersTest(List<Integer> list1, List<Integer> list2, List<Integer> expected) {
        ListNode head1 = ListNode.fromList(list1);
        ListNode head2 = ListNode.fromList(list2);
        ListNode head3 = solution.addTwoNumbers(head1, head2);
        System.out.println(head3);
        if (expected.size() == 0) {
            assertNull(head3);
        } else {
            assertIterableEquals(expected, head3);
        }
    }

    @Test
    void addTwoNumbersTest1() {
        addTwoNumbersTest(Arrays.asList(2, 4, 3), Arrays.asList(5, 6, 4), Arrays.asList(7, 0, 8));
    }

    @Test
    void addTwoNumbersTest2() {
        addTwoNumbersTest(List.of(0), List.of(0), List.of(0));
    }

    @Test
    void addTwoNumbersTest3() {
        addTwoNumbersTest(Arrays.asList(9, 9, 9, 9, 9, 9, 9), Arrays.asList(9, 9, 9, 9), Arrays.asList(8, 9, 9, 9, 0, 0, 0, 1));
    }

}