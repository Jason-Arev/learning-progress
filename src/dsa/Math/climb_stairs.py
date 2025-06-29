class Solution:
    def climbStairs(self, n: int) -> int:
        a = 0
        b = 1
        res = 0
        for i in range(1, n + 1):
            res = a + b
            a = b
            b = res
        return res