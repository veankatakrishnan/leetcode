class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        prev, next = 0, 1
        for _ in range(n):
            prev, next = next, next + prev
        
        return next
        