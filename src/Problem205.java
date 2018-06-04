import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 */
class Problem205 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            Set<Character> values = new HashSet<>();
            char[] valueChars = t.toCharArray();
            char[] keyChars = s.toCharArray();
            HashMap<Character, Character> map = new HashMap<>();
            for (int i = 0; i < keyChars.length; i++) {
                Character mapValue = map.get(keyChars[i]);
                if (mapValue == null && !values.contains(valueChars[i])) {
                    map.put(keyChars[i], valueChars[i]);
                    values.add(valueChars[i]);
                } else if (mapValue == null || mapValue != valueChars[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
