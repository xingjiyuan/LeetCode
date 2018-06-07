import java.util.LinkedHashMap;

class TestMain {
    public static void main(String[] args) {
        //.out.println(new Problem76().new Solution().minWindow("ADOBECODEBANC", "ABC"));
        //printIntArray(new Problem350().new Solution().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        //System.out.println(new Problem202().new Solution().isHappy(19));
        //System.out.println(new Problem290().new Solution().wordPattern("abba", "dog cat cat dog"));
        //System.out.println(new Problem205().new Solution().isIsomorphic("egg", "add"));
        //System.out.println(new Problem451().new Solution().frequencySort("tree"));
        //System.out.println(new Problem15().new Solution().threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0}));
        //System.out.println(new Problem18().new Solution().fourSum(new int[]{1,-2,-5,-4,-3,3,3,5}, -11));
        //System.out.println(new Problem16().new Solution().threeSumClosest(new int[]{1,-2,-5,-4,-3,3,3,5}, -11));
        //System.out.println(new Problem16().new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        //System.out.println(new Problem16().new Solution().threeSumClosest(new int[]{-3,-2,-5,3,-4}, -1));
        System.out.println(new Problem16().new Solution().threeSumClosest(new int[]{-55, -24, -18, -11, -7, -3, 4, 5, 6, 9, 11, 23, 33}, 0));
        System.out.println(new Problem15().new Solution().threeSum(new int[]{-55, -24, -18, -11, -7, -3, 4, 5, 6, 9, 11, 23, 33}));
        System.out.println(new Problem16().new Solution().threeSumClosest(new int[]{-11, -7, -3, 4, 5, 6, 9, 11, 23, 33}, 0));

    }

    private static String printMap(LinkedHashMap<Integer, Integer> test) {
        StringBuilder result = new StringBuilder("[");
        for (Integer key : test.keySet()) {
            result.append(key).append(":").append(test.get(key)).append(", ");
        }
        if (result.length() > 2) {
            result.delete(result.length() - 2, result.length());
        }
        result.append("]");
        System.out.println(result);

        return result.toString();
    }

    private static void printIntArray(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i : array) {
            result.append(i).append(", ");
        }
        if (result.length() > 2) {
            result.delete(result.length() - 2, result.length());
        }
        result.append("]");
        System.out.println(result);
    }
}
