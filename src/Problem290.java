import java.util.HashSet;
import java.util.Set;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 * <p>
 * Credits:
 * Special thanks to @minglotus6 for adding this problem and creating all test cases.
 */
class Problem290 {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] splits = str.split(" ");
            if (splits.length != pattern.length()) {
                return false;
            }
            Set<String> values = new HashSet<>();
            String[] freq = new String[256];
            char[] chars = pattern.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (freq[chars[i]] == null && !values.contains(splits[i])) {
                    freq[chars[i]] = splits[i];
                    values.add(splits[i]);
                } else if (!splits[i].equals(freq[chars[i]])) {
                    return false;
                }
            }
            return true;
        }
    }
}
