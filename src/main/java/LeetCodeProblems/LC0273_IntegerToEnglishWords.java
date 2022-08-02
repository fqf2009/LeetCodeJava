package LeetCodeProblems;

public class LC0273_IntegerToEnglishWords {
    private final String[] words20 = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private final String[] wordsTens = {
            "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        String res;
        if (num < 20) {
            return words20[num];
        } else if (num < 100) {
            res = wordsTens[num / 10 - 2] + (num % 10 == 0 ? "" : " " + words20[num % 10]);
        } else if (num < 1000) {
            res = numberToWords(num / 100) + " Hundred " + numberToWords(num % 100);
        } else if (num < 1000_000) {
            res = numberToWords(num / 1000) + " Thousand " + numberToWords(num % 1000);
        } else if (num < 1000_000_000) {
            res = numberToWords(num / 1000_000) + " Million " + numberToWords(num % 1000_000);
        } else {
            res = numberToWords(num / 1000_000_000) + " Billion " + numberToWords(num % 1000_000_000);
        }
        return res.endsWith(" Zero") ? res.substring(0, res.length() - 5) : res;
    }
}
