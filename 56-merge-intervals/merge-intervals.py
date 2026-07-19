class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort()
        current_start, current_end = intervals[0]

        mergeIntervals = []

        for interval_start, interval_end in intervals[1:]:
            #No Overlap
            if(current_end < interval_start):
                mergeIntervals.append([current_start, current_end])
                current_start, current_end = interval_start, interval_end
            #Overlap
            else:
                current_end = max(current_end, interval_end)

        mergeIntervals.append([current_start, current_end])
        return mergeIntervals