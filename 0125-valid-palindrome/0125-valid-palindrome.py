class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = "".join(c.lower() for c in s if c.isalnum())
        rev = new[::-1]
        return new == rev
    
