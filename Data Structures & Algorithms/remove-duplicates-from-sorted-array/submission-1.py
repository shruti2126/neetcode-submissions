class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        L, R = 0, 1

        while R <= len(nums) - 1:
            if nums[L] != nums[R]:
                L = R 
                R += 1
            else: 
                while R <= len(nums) - 1 and nums[L] == nums[R]:
                    R += 1 
                
                if R < len(nums):
                    L += 1
                    nums[L] = nums[R]
                    
                
        return L + 1