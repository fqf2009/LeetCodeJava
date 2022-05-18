package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0253_MeetingRoomsIITest {
    private LC0253_MeetingRoomsII sol;

    @BeforeEach
    void setUp() {
        sol = new LC0253_MeetingRoomsII();
    }

    @Test
    void minMeetingRooms1() {
        int[][] intervals = {{8, 14}, {12, 13}, {6, 13}, {1, 9}};
        assertEquals(3, sol.minMeetingRooms(intervals));
        assertEquals(3, sol.minMeetingRooms1(intervals));
    }

    @Test
    void minMeetingRooms2() {
        int[][] intervals = {{9, 16}, {6, 16}, {1, 9}, {3, 15}};
        assertEquals(3, sol.minMeetingRooms(intervals));
        assertEquals(3, sol.minMeetingRooms1(intervals));
    }

    @Test
    void minMeetingRooms3() {
        int[][] intervals = {{13, 15}, {1, 13}};
        assertEquals(1, sol.minMeetingRooms(intervals));
        assertEquals(1, sol.minMeetingRooms1(intervals));
    }

    @Test
    void minMeetingRooms4() {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        assertEquals(2, sol.minMeetingRooms(intervals));
        assertEquals(2, sol.minMeetingRooms1(intervals));
    }

    @Test
    void minMeetingRooms5() {
        int[][] intervals = {{7, 10}, {2, 4}};
        assertEquals(1, sol.minMeetingRooms(intervals));
        assertEquals(1, sol.minMeetingRooms1(intervals));
    }

    @Test
    void minMeetingRooms6() {
        int[][] intervals = {{9, 10}, {4, 9}, {4, 17}};
        assertEquals(2, sol.minMeetingRooms(intervals));
        assertEquals(2, sol.minMeetingRooms1(intervals));
    }
}