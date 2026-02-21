package templates;

/**
 * 코딩테스트 Java 풀이 템플릿
 *
 * 실행: ./gradlew run -PmainClass=templates.Solution
 */
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        // 테스트
        int[] nums = {2, 7, 11, 15};
        int[] result = s.twoSum(nums, 9);
        System.out.println("결과: " + result[0] + ", " + result[1]); // 0, 1
    }

    // LeetCode 1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
