import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4SUM
 * <p>
 * Given an array nums of n integers and an integer target, are there elements a, b, c,
 * and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate quadruplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 * <p>
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 */
class Problem18 {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            if (nums.length < 4) {
                return result;
            }

            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            while (i <= nums.length - 4 && (nums[i] <= target || target < 0)) {
                j = i + 1;
                while (j <= nums.length - 3 && (nums[j] <= target - nums[i] || target < 0)) {
                    k = j + 1;
                    l = nums.length - 1;
                    while (k < l && (target >= 0 || nums[l] > target)) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum > target) {
                            while (k < l && nums[l - 1] == nums[l]) {
                                l--;
                            }
                            l--;
                        } else if (sum < target) {
                            while (k < l && nums[k + 1] == nums[k]) {
                                k++;
                            }
                            k++;
                        } else {
                            result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            while (k < l && nums[l - 1] == nums[l]) {
                                l--;
                            }
                            l--;
                            while (k < l && nums[k + 1] == nums[k]) {
                                k++;
                            }
                            k++;
                        }
                    }
                    while (j <= nums.length - 3 && nums[j + 1] == nums[j]) {
                        j++;
                    }
                    j++;
                }
                while (i <= nums.length - 4 && nums[i + 1] == nums[i]) {
                    i++;
                }
                i++;
            }

            return result;
        }
    }
}
