class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            for (char c : str.toCharArray()) {
                counts[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : counts) {
                sb.append(i).append("#");
            }
            String key = sb.toString();
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }
}
