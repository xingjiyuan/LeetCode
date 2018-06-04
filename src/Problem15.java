import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 3SUM
 * <p>
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
class Problem15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Map<String, List<Integer>> storeMap = new HashMap<>();
            List<List<Integer>> result = new ArrayList<>();
            Set<Integer> store = new HashSet<>();
            if (nums.length < 3) {
                return result;
            }
            store.add(nums[0]);
            for (int i = 1; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int find = -nums[i] - nums[j];
                    int first = find;
                    int second = nums[i];
                    int third = nums[j];
                    if (first > second) {
                        int temp = first;
                        first = second;
                        second = temp;
                    }
                    if (second > third) {
                        int temp = second;
                        second = third;
                        third = temp;
                    }
                    if (first > second) {
                        int temp = first;
                        first = second;
                        second = temp;
                    }
                    String key = "" + first + second + third;
                    List<Integer> usedStore = storeMap.get(key);
                    if (store.contains(find) && !(usedStore != null && usedStore.contains(nums[i]) && usedStore.contains(nums[j]) && usedStore.contains(find))) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(find);
                        temp.add(nums[i]);
                        temp.add(nums[j]);

                        storeMap.put(key, temp);
                        result.add(temp);
                    }
                }
                store.add(nums[i]);
            }
            return result;
        }
    }
}
