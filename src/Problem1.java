import java.util.HashMap;
import java.util.Map;

/**
 * TWO SUM
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> stores = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (stores.get(target - nums[i]) != null) {
                result[0] = stores.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            stores.put(nums[i], i);
        }
        return result;
    }
}
