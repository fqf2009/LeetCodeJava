package LeetCodeProblems;

import java.util.*;

public class LC0253_MeetingRoomsII {
    // Sweep Line
    public int minMeetingRooms(int[][] intervals) {
        List<int[]> timetable = new ArrayList<>();
        for (int[] itv : intervals) {
            timetable.add(new int[]{itv[0], 1});
            timetable.add(new int[]{itv[1], -1});
        }

        timetable.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int res = 0, rooms = 0;
        for (int[] itv : timetable) {
            rooms += itv[1];
            res = Integer.max(res, rooms);
        }
        return res;
    }

//    Does not wok for duplicate time points
//    public int minMeetingRooms(int[][] intervals) {
//        NavigableMap<Integer, Integer> timetable = new TreeMap<>();
//        for(int[] itv: intervals){
//            timetable.put(itv[0], 1);
//            timetable.put(itv[1], -1);
//        }
//
//        int res = 0, rooms = 0;
//        for(var e: timetable.entrySet()) {
//            rooms += e.getValue();
//            res = Integer.max(res, rooms);
//        }
//        return res;
//    }

    // Priority Queue
    public int minMeetingRooms1(int[][] intervals) {
        Queue<Integer> usedRooms = new PriorityQueue<>();
//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int[] itv : intervals) {
            int start = itv[0], end = itv[1];
            if (usedRooms.size() > 0 && start >= usedRooms.peek()) {
                usedRooms.poll();
            }
            usedRooms.add(end);
        }
        return usedRooms.size();
    }
}
