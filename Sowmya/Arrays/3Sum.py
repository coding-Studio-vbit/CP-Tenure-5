class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(set(nums))==1 and nums[0]==0:
            return [[0,0,0]]
        hashmap = {}
        result = set()

        for i in range(len(nums)):
            hashmap[nums[i]]=i

        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                k = -(nums[i]+nums[j])
                if k in hashmap.keys() and (hashmap[k]!=i and hashmap[k]!=j):
                    result.add(tuple(sorted([nums[i], nums[j], k])))
        
        return result