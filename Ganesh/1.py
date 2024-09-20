import copy
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        a = copy.deepcopy(matrix)
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if a[i][j] == 0 :
                    for k in range(len(matrix)):
                        matrix[k][j] = 0
                    matrix[i] = [0]*len(a[i])