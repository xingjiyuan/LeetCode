import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
class Problem350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map1 = new HashMap();
            for (int i : nums1) {
                if (map1.get(i) == null) {
                    map1.put(i, 1);
                } else {
                    map1.put(i, map1.get(i) + 1);
                }
            }
            List<Integer> resultList = new ArrayList<>();
            for (int i : nums2) {
                if (map1.get(i) != null && map1.get(i) != 0) {
                    map1.put(i, map1.get(i) - 1);
                    resultList.add(i);
                }
            }

            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }
            return result;
        }
    }
}
