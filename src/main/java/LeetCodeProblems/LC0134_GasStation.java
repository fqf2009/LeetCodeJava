package LeetCodeProblems;

public class LC0134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0, currTank = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            int delta = gas[i] - cost[i];
            totalTank += delta;
            currTank += delta;
            if (currTank < 0) {
                currTank = 0;
                start = i + 1;
            }
        }
        return totalTank >= 0 ? start : -1;
    }
}
