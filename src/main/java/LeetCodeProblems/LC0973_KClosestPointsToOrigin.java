package LeetCodeProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LC0973_KClosestPointsToOrigin {
    static class Node implements Comparable<Node> {
        long dist;
        int[] cord;

        Node(long dist, int[] cord) {
            this.dist = dist;
            this.cord = cord;
        }

        @Override
        public int compareTo(Node other) {
            return Long.compare(other.dist, this.dist); // reverse order
        }
    }

    // PriorityQueue: O(n*log(k))
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var p : points) {
            long x = p[0], y = p[1];
            long dist = x * x + y * y;
            if (pq.size() < k) {
                pq.add(new Node(dist, p));
            } else {
                if (dist < pq.peek().dist) {
                    pq.poll();
                    pq.add(new Node(dist, p));
                }
            }
        }

        int[][] res = new int[k][];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().cord;
        }

        return res;
    }

    // PriorityQueue simplified syntax
    public int[][] kClosest1(int[][] points, int k) {
        // max heap - reversed order
        PriorityQueue<int[]> pq = new PriorityQueue<>((b, a) -> a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1]);
        for (var p : points) {
            pq.offer(p);
            if (pq.size() > k) pq.poll();
        }

        return pq.toArray(int[][]::new);
    }

    // Sort: O(n*log(n))
    public int[][] kClosest2(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1]);
        return Arrays.copyOfRange(points, 0, k);
    }

    // Quick Select: O(n), O(n + n/2 + n/4 + ...) => O(2n) => O(n)
    public int[][] kClosest3(int[][] points, int k) {
        int lo = 0, hi = points.length - 1;
        while (lo < hi) {
            int mid = partition(points, lo, hi);
            if (mid == k) {
                break;
            } else if (mid < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return Arrays.copyOfRange(points, 0, k);
    }

    private int compare(int[] p1, int[] p2) {
        return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
    }

    private int partition(int[][] arr, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int[] pivot = arr[mid];
        arr[mid] = arr[lo];
        while (lo < hi) {
            while (lo < hi && compare(arr[hi], pivot) >= 0) hi--;
            arr[lo] = arr[hi];
            while (lo < hi && compare(arr[lo], pivot) <= 0) lo++;
            arr[hi] = arr[lo];
        }
        arr[lo] = pivot;
        return lo;
    }
}
