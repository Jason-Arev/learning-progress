from typing import List
class Solution:
    def mergeArrays(
        self, nums1: List[List[int]], nums2: List[List[int]]
    ) -> List[List[int]]:
        key_to_sum = {}

        for nums in nums1:
            key_to_sum[nums[0]] = nums[1]

        for nums in nums2:
            key_to_sum[nums[0]] = key_to_sum.get(nums[0], 0) + nums[1]

        merged_array = []
        for key, value in sorted(key_to_sum.items()):
            merged_array.append([key, value])

        return merged_array