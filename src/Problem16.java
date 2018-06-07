import java.util.Arrays;

/**
 * 3Sum Closest
 * <p>
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * <p>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
class Problem16 {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int i = 0;
            int j = 0;
            int k = 0;
            int result = 0;
            int minDistance = Integer.MAX_VALUE;
            while (i < nums.length - 2) {
                j = i + 1;
                k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int distance = Math.abs(sum - target);
                    if (minDistance > distance) {
                        minDistance = distance;
                        result = sum;
                    }
                    if (sum == target) {
                        return result;
                    } else if (sum < target) {
                        while (j < k && nums[j + 1] == nums[j]) {
                            j++;
                        }
                        j++;
                    } else if (sum > target) {
                        while (j < k && nums[k - 1] == nums[k]) {
                            k--;
                        }
                        k--;
                    } else {
                        break;
                    }
                }
                while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                    i++;
                }
                i++;
            }
            return result;
        }
    }
}
