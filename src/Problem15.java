import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            Set<Integer> store = new HashSet<>();
            if (nums.length < 3) {
                return result;
            }
            store.add(nums[0]);
            for (int i = 1; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (i < j - 1 && nums[i] == nums[i + 1]) {
                        i++;
                        store.add(nums[i]);
                    }
                    int find = -nums[i] - nums[j];
                    if (store.contains(find)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(find);
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        result.add(temp);
                    }
                }
                store.add(nums[i]);
            }
            return result;
        }
    }
}
