class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = []
        for word in strs:
            encoded.append(str(len(word)) + "!")
            encoded.append(word)
        return "".join(encoded)

    def decode(self, s: str) -> List[str]:
        words = []
        i, j = 0, 0
        while i < len(s):
            while s[j] != "!":
                j += 1
            curr_word_len = int(s[i:j])
            i = j + 1
            j = i + curr_word_len
            words.append(s[i:j])
            i = j
        return words
