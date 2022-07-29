package LeetCodeProblems;

import java.util.TreeSet;

// add: O(log(n); get: O(1)
public class LC2102_SequentiallyOrdinalRankTracker {
    private class Location implements Comparable<Location>{
        String name;
        int score;

        Location(String name, int score){
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Location other){
            return this.score == other.score ? this.name.compareTo(other.name):
                    other.score - this.score;
        }
    }

    private TreeSet<Location> locations;
    Location nextLoc;

    public LC2102_SequentiallyOrdinalRankTracker() {
        locations = new TreeSet<>();
        nextLoc = new Location("", 0);
        locations.add(nextLoc);
    }

    public void add(String name, int score) {
        Location loc = new Location(name, score);
        locations.add(loc);
        if(loc.compareTo(nextLoc) < 0){
            nextLoc = locations.lower(nextLoc);
        }
    }

    public String get() {
        String res = nextLoc.name;
        nextLoc = locations.higher(nextLoc);
        return res;
    }
}
