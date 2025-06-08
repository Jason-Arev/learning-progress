from typing import List

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = [] #create empty list

        for row_num in range(numRows):
            #create placeholder values in each row
            row = [None for _ in range(row_num + 1)] #increase each row size by 1
            row[0], row[-1] = 1, 1 #outside values always equal 1

            for j in range(1, len(row) - 1): #values inside the triangle excluding the outer values
                row[j] = triangle[row_num - 1][j - 1] + triangle[row_num - 1][j]

            triangle.append(row) #appends new list of values to the returned list
        return triangle