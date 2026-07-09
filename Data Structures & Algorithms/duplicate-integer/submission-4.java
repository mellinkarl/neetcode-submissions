class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> elems = new HashSet<>();
        for (int num : nums) {
            elems.add(num);
        }
        return nums.length != elems.size();
    }
}