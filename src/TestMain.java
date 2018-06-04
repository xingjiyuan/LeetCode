import java.util.LinkedHashMap;

class TestMain {
    public static void main(String[] args) {
        //.out.println(new Problem76().new Solution().minWindow("ADOBECODEBANC", "ABC"));
        printIntArray(new Problem350().new Solution().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        //System.out.println(new Problem202().new Solution().isHappy(19));
        //System.out.println(new Problem290().new Solution().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new Problem205().new Solution().isIsomorphic("egg", "add"));
        System.out.println(new Problem451().new Solution().frequencySort("tree"));
        System.out.println(new Problem15().new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new Problem15().new Solution().threeSum(new int[]{0, 0, 0, 0}));
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
