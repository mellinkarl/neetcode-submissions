class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
        );
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            }
            else {
                if (stack.size() == 0 || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
