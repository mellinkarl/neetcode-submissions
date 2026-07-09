class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> counts1 = new HashMap<>();
        HashMap<Character, Integer> counts2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counts1.put(s.charAt(i), counts1.getOrDefault(s.charAt(i), 0) + 1);
            counts2.put(t.charAt(i), counts2.getOrDefault(t.charAt(i), 0) + 1);
        }
        return counts2.equals(counts1);
    }
}
