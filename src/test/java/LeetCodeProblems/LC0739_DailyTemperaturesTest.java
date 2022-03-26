package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LC0739_DailyTemperaturesTest {
    private LC0739_DailyTemperatures solution;

    @BeforeEach
    void setup() {
        solution = new LC0739_DailyTemperatures();
    }

    void dailyTemperaturesTest(int[] temperatures, int[] target) {
        int[] waitDays = solution.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(waitDays));
        assertArrayEquals(target, waitDays);
    }

    @Test
    void dailyTemperaturesTestCase1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        dailyTemperaturesTest(temperatures, expected);
    }

    @Test
    void dailyTemperaturesTestCase2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] expected = {1, 1, 1, 0};
        dailyTemperaturesTest(temperatures, expected);
    }

    @Test
    void dailyTemperaturesTestCase3() {
        int[] temperatures = {30, 60, 90};
        int[] expected = {1, 1, 0};
        dailyTemperaturesTest(temperatures, expected);
    }
}