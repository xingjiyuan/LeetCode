import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
class Problem202 {
    class Solution {
        public boolean isHappy(int n) {
            int[] squares = new int[10];
            for (int i = 0; i < squares.length; i++) {
                squares[i] = i * i;
            }

            Set<Integer> store = new HashSet<>();
            store.add(n);
            while (n != 1) {
                int temp = n;
                int sum = 0;
                while (temp != 0) {
                    sum += squares[temp % 10];
                    temp /= 10;
                }
                n = sum;
                if (store.contains(n)) {
                    return false;
                } else {
                    store.add(n);
                }
            }
            return true;
        }
    }
}
