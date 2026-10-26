class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        output = []
        l, r = 0, len(numbers) - 1
        while l < r:
            left, right = numbers[l], numbers[r]
            curr_sum = left + right
            if curr_sum == target:
                output.append(l + 1)
                output.append(r + 1)
                break
            elif curr_sum > target:
                r -= 1
            elif curr_sum < target:
                l += 1
            
        return output