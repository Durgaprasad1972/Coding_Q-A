/*
Given a matrix, A of size M x N of 0s and 1s. If an element is 0, set its entire row and column to 0.
Note: This will be evaluated on the extra memory used. Try to minimize the space and time complexity.

Input Format:
The first and the only argument of input contains a 2-d integer matrix, A, of size M x N.

Output Format:
Return a 2-d matrix that satisfies the given conditions.

Constraints:
1 <= N, M <= 1000
0 <= A[i][j] <= 1

Examples:

Input 1:
    [   [1, 0, 1],
        [1, 1, 1], 
        [1, 1, 1]   ]

Output 1:
    [   [0, 0, 0],
        [1, 0, 1],
        [1, 0, 1]   ]

Input 2:
    [   [1, 0, 1],
        [1, 1, 1],
        [1, 0, 1]   ]

Output 2:
    [   [0, 0, 0],
        [1, 0, 1],
        [0, 0, 0]   ]
*/

public class set_Matrix_Zeros{
   public void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        
        for (int i=0;i<matrix.size();i++) {
            if (matrix.get(i).get(0) == 0) {
                firstCol = true;
                break;
            }
        }
        
        for (int i=0;i<matrix.get(0).size();i++) {
            if (matrix.get(0).get(i) == 0) {
                firstRow = true;
                break;
            }
        }
        
        for (int i=0;i<matrix.size();i++) {
            for (int j=0;j<matrix.get(0).size();j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0);
                    matrix.get(0).set(j, 0);
                }
            }
        }
        
        for(int i=1; i<matrix.size(); i++){
            for(int j=1; j<matrix.get(i).size(); j++){
                if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){
                   matrix.get(i).set(j, 0);
                }
            }
        }
        
        if(firstCol){
            for(int i=0; i<matrix.size(); i++)
                matrix.get(i).set(0,0);
        }
 
        if(firstRow){
            for(int i=0; i<matrix.get(0).size(); i++)
                matrix.get(0).set(i, 0);
        }
    }
}

