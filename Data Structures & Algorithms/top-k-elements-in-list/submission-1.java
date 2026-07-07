class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> freq = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            freq.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            freq.get(entry.getValue()).add(entry.getKey());
        }
        int[] res = new int[k];
        int idx = 0;
        for (int i = freq.size() - 1; i > -1 && idx < k; i--) {
            for (int num : freq.get(i)) {
                res[idx++] = num;
                if (idx == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
