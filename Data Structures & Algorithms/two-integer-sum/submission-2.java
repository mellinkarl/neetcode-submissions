class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.get(nums[i]) != null) {
                return new int[] {seen.get(nums[i]), i};
            }
            seen.put(target - nums[i], i);
        }
        return new int[] {};
    }
}
