package LeetCodeProblems;

public class LC0028_Implement_strStr {
    // rolling hash
    public int strStr(String haystack, String needle) {
        int k = needle.length();
        if (k == 0) return 0;
        if (k > haystack.length()) return -1;

        int p = 31, mod = 53, pn = 1;
        int h1 = 0, h2 = 0;
        for (int i = k - 1; i >= 0; i--) {
            pn %= mod;
            h1 = (h1 + (haystack.charAt(i) - 'a' + 1) * pn % mod) % mod;
            h2 = (h2 + (needle.charAt(i) - 'a' + 1) * pn % mod) % mod;
            pn *= p;
        }

        pn /= p;
        if (h1 == h2 && haystack.startsWith(needle)) return 0;
        for (int i = 0; i < haystack.length() - k; i++) {
            h1 = ((h1 + mod - (haystack.charAt(i) - 'a' + 1) * pn % mod) * p +
                    (haystack.charAt(i + k) - 'a' + 1)) % mod;
            if (h1 == h2 && haystack.startsWith(needle, i + 1)) return i + 1;
        }
        return -1;
    }

    // rolling hash
    public int strStr1(String haystack, String needle) {
        int k = needle.length();
        if (k == 0) return 0;
        if (k > haystack.length()) return -1;

        int p = 31, mod = 53, pn = 1;
        int h1 = 0, h2 = 0;
        for (int i = k - 1; i >= 0; i--) {
            pn = (pn * p) % mod;
            h1 = (h1 + (haystack.charAt(i) - 'a' + 1) * pn % mod) % mod;
            h2 = (h2 + (needle.charAt(i) - 'a' + 1) * pn % mod) % mod;
        }

        if (h1 == h2 && haystack.startsWith(needle)) return 0;
        for (int i = 0; i < haystack.length() - k; i++) {
            h1 = (h1 + (haystack.charAt(i + k) - 'a' + 1) +
                    mod - (haystack.charAt(i) - 'a' + 1) * pn % mod) * p % mod;
            if (h1 == h2 && haystack.startsWith(needle, i + 1)) return i + 1;
        }
        return -1;
    }
}
