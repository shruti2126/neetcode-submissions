
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        length = len(nums)
        if length == 0 or length == 1:
            return length
        nums.sort()
        max_len = 1 
        cur_len = max_len 
        for i in range(1, len(nums)):
            diff = nums[i] - nums[i-1]
            if 0 <= diff <= 1:
                cur_len += diff
                max_len = max(cur_len, max_len)
            else:
                cur_len = 1 # reset length if number not consecutive (diff > 1)
            
        return max_len