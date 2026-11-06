from collections import Counter
class Solution:
    
    def isAnagram(self, s: str, t: str) -> bool:
        freq_s, freq_t = Counter(s), Counter(t)
        if freq_s == freq_t:
            return True

        return False