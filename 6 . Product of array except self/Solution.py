class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [0]*len(nums)

        prev ,next = 1, 1

        for i in range(len(nums)):
            ans[i] = prev
            prev = prev * nums[i]

        for i in range(len(nums)-1,-1,-1):
            ans[i] = ans[i]*next
            next = next*nums[i]
        
        return ans
