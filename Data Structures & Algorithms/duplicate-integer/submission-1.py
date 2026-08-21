class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        arr : List[int] = []
        for n in nums:
            if n in arr:
                return True #found duplicate
            else: 
                arr.append(n) # keep searching
        return False # out of loop, didn't find duplicate :(, return false