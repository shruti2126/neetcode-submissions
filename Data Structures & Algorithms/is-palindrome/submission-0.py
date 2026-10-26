
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        for ch in s:
            if not ch.isalnum():
               s = s.replace(ch, "")
        p = 0
        q = len(s) - 1
        while p <= q:
            if s[p] != s[q]:
                return False
            p += 1
            q -= 1
        
        return True
                
    