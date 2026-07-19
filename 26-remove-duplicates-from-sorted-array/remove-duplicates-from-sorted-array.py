class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k = 1
        for i in range(len(nums)):
            if(nums[k-1] != nums[i]):
                nums[k] = nums[i]
                k += 1
        
        return k
