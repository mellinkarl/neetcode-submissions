class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> char_freq = new HashMap<>();
        for (String s : strs) {
            int[] chars = new int[26];
            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }
            String key = Arrays.toString(chars);
            char_freq.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
        }
        return new ArrayList<>(char_freq.values());
    }
}
