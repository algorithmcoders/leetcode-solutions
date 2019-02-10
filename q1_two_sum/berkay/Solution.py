class Solution(object):

    def twoSum(self, nums, target):
        l = len(nums)
        for i in range(l):
            x = target - nums[i]
            t = nums[i+1:]
            if x in t:
                return [i,t.index(x)+i+1]