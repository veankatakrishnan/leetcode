class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        decimal_a = int(a, 2)
        decimal_b = int(b, 2)
        d_sum = decimal_a + decimal_b
        return bin(d_sum)[2:]