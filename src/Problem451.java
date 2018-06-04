import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * "tree"
 * <p>
 * Output:
 * "eert"
 * <p>
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 * <p>
 * Input:
 * "cccaaa"
 * <p>
 * Output:
 * "cccaaa"
 * <p>
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * Example 3:
 * <p>
 * Input:
 * "Aabb"
 * <p>
 * Output:
 * "bbAa"
 * <p>
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 */
class Problem451 {
    class Solution {
        public String frequencySort(String s) {
            Map<Character, Integer> freqMap = new HashMap<>();
            char[] chars = s.toCharArray();
            for (char ch : chars) {
                freqMap.put(ch, freqMap.get(ch) == null ? 1 : freqMap.get(ch) + 1);
            }
            List<Map.Entry<Character, Integer>> sortList = new ArrayList<>();
            sortList.addAll(freqMap.entrySet());
            sortList.sort((o1, o2) -> o2.getValue() - o1.getValue());
            int index = 0;
            for (Map.Entry<Character, Integer> entry : sortList) {
                for (int i = 0; i < entry.getValue(); i++) {
                    chars[index++] = entry.getKey();
                }
            }
            return new String(chars);
        }
    }
}
