import heapq
from collections import Counter 

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if k==len(nums):
            return sorted(nums,reverse=True)
        
        freq = Counter(nums)
        heap = []

        for num, count in freq.items():
            heapq.heappush(heap,(count,num))
            if len(heap)>k:
                heapq.heappop(heap)
        
        return [num for count, num in sorted(heap,key = lambda x: (-x[0],-x[1]))]


        