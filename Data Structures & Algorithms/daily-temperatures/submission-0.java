class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[1]) {
                int[] elem = stack.pop();
                res[elem[0]] = i - elem[0];
            }
            stack.push(new int[]{i, temperatures[i]});
        }
        while (!stack.isEmpty()) {
            int[] elem = stack.pop();
            res[elem[0]] = 0;
        }
        return res;
    }
}
