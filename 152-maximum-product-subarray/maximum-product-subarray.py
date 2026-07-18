class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        prefix = 1
        suffix = 1
        product = float('-inf')
        
        for i in range(len(nums)):
            if(prefix == 0): prefix = 1
            if(suffix == 0): suffix = 1

            prefix *= nums[i]
            suffix *= nums[len(nums) - 1 - i]

            product = max(product, max(prefix, suffix))

        return product

        