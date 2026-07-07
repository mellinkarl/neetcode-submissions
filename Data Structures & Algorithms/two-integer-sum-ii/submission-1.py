class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        n = len(numbers)
        left_ptr, right_ptr = 0, n - 1
        while left_ptr < right_ptr:
            curr_sum = numbers[left_ptr] + numbers[right_ptr]
            if curr_sum == target:
                return [left_ptr + 1, right_ptr + 1]
            elif curr_sum < target:
                left_ptr += 1
            else:
                right_ptr -= 1

