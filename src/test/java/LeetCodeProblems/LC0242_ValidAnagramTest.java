package LeetCodeProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC0242_ValidAnagramTest {

    @Test
    void isAnagram() {
        LC0242_ValidAnagram sol = new LC0242_ValidAnagram();
        assertTrue(sol.isAnagram("anagram", "nagaram"));
        assertFalse(sol.isAnagram("rat", "car"));
    }

    @Test
    void isAnagram1() {
        LC0242_ValidAnagram sol = new LC0242_ValidAnagram();
        assertTrue(sol.isAnagram1("anagram", "nagaram"));
        assertFalse(sol.isAnagram1("rat", "car"));
    }

    @Test
    void isAnagram2() {
        LC0242_ValidAnagram sol = new LC0242_ValidAnagram();
        assertTrue(sol.isAnagram2("anagram", "nagaram"));
        assertFalse(sol.isAnagram2("rat", "car"));
    }
}