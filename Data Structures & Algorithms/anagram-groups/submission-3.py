class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        word_map = defaultdict(list)
        for s in strs:
            char_count = [0] * 26
            for char in s:
                char_count[ord(char) - ord('a')] += 1
            word_map[tuple(char_count)].append(s)
        return list(word_map.values())