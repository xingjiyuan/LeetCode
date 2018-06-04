/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
class Problem242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] freq = new int[256];
            for (char ch : s.toCharArray()) {
                freq[ch]++;
            }
            for (char ch : t.toCharArray()) {
                freq[ch]--;
            }
            for (int i : freq) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
