import java.util.HashMap;
import java.util.Map;

/**
 * Number of Boomerangs
 * <p>
 * Given n points in the plane that are all pairwise distinct,
 * a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * <p>
 * Find the number of boomerangs.
 * You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * <p>
 * Example:
 * Input:
 * [[0,0],[1,0],[2,0]]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
class Problem447 {
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            int count = 0;
            for (int i = 0; i < points.length; i++) {
                Map<Double, Integer> store = new HashMap<>();
                for (int j = 0; j < points.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    double distance = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);
                    store.merge(distance, 1, (a, b) -> a + b);
                }
                for (Map.Entry<Double, Integer> entry : store.entrySet()) {
                    count += entry.getValue() * (entry.getValue() - 1);
                }
            }
            return count;
        }
    }
}
