package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0134_GasStationTest {
    LC0134_GasStation sol;

    @BeforeEach
    void setUp() {
        sol = new LC0134_GasStation();
    }

    @Test
    void canCompleteCircuit1() {
        int[] gas = {7, 1, 0, 11, 4};
        int[] cost = {5, 9, 1, 2, 5};
        assertEquals(3, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit2() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        assertEquals(3, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    void canCompleteCircuit3() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        assertEquals(-1, sol.canCompleteCircuit(gas, cost));
    }
}