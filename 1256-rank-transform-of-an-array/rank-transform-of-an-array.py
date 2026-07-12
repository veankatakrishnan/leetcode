class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        sortedArr = sorted(set(arr))
        result = []
        for num in arr:
            result.append(self.binarySearch(0, len(sortedArr), sortedArr, num) + 1)

        return result

        
    
    def binarySearch(self, l, r, arr, target):
        while(l <= r):
            mid = l + (r - l)//2
            if arr[mid] == target:
                return mid
            elif arr[mid] < target:
                l = mid + 1
            else: r = mid - 1
        