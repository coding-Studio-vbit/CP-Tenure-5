class Solution:

    def findMinDiff(self, A,N,M):

        A = sorted(A)
        min_diff = A[-1] - A[0]
        for i in range(M-1,len(A)):
            if A[i] - A[i-M+1] < min_diff:
                min_diff = A[i] - A[i-M+1]
        return min_diff