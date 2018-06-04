import java.util.LinkedList;

/**
 * Minimum Window Substring
 * <p>
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * <p>
 * Example:
 * <p>
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 * Note:
 * <p>
 * If there is no such window in S that covers all characters in T, return the empty string "".
 * If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class Problem76 {
    class Pair {
        char key;
        int value;

        public Pair(char key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof Pair && ((Pair) o).key == this.key;
        }
    }

    class Solution {
        public String minWindow(String s, String t) {
            int[] freq = new int[256];
            int[] freq2 = new int[256];
            int right = 0;
            for (char ch : t.toCharArray()) {
                freq[ch]++;
                freq2[ch]++;
            }
            char[] chars = s.toCharArray();
            LinkedList<Pair> store = new LinkedList<>();
            String result = "";
            while (right < chars.length) {
                if (freq2[chars[right]] != 0) {
                    if (freq[chars[right]] != 0) {
                        freq[chars[right]]--;
                        store.add(new Pair(chars[right], right));
                    } else {
                        Pair pair = new Pair(chars[right], right);
                        store.remove(pair);
                        store.add(pair);
                    }
                }
                right++;

                if (store.size() == t.length()) {
                    Pair poll = store.poll();
                    int left = poll.value;
                    if (result.isEmpty() || result.length() > right - left) {
                        result = s.substring(left, right);
                    }
                    freq[poll.key]++;
                }
            }
            return result;
        }
    }
}
