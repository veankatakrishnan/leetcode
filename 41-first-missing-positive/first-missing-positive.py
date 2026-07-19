class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        missing = 1
        for num in nums:
            if(num == missing):
                missing += 1
        return missing