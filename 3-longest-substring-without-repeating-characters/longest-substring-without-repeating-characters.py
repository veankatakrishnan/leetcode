class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        seen = set()
        left = 0
        maxCount = 0

        for right in range(len(s)):
            while(s[right] in seen):
                seen.remove(s[left])
                left += 1
            
            seen.add(s[right])
            maxCount = max(maxCount, right - left + 1)
        
        return maxCount

