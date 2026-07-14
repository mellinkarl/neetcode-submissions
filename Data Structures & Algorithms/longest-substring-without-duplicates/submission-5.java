class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0, slow = 0;
        HashSet<Character> set = new HashSet<>();
        for (int fast = 0; fast < s.length(); fast++) {
            while (set.contains(s.charAt(fast))) {
                set.remove(s.charAt(slow++));
            }
            set.add(s.charAt(fast));
            max_len = Math.max(max_len, set.size());
        }
        return max_len;
    }
}
