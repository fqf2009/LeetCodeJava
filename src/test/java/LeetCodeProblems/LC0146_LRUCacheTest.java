package LeetCodeProblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0146_LRUCacheTest {
    @Test
    void test_LRUCache() {
        LC0146_LRUCache lruCache = new LC0146_LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        assertEquals(-1, lruCache.get(2)); // (not found)
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        assertEquals(-1, lruCache.get(1)); // (not found)
        assertEquals(3, lruCache.get(3)); // (not found)
        assertEquals(4, lruCache.get(4)); // (not found)
    }
}