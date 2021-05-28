/*
Problem Description
Given a 2D integer matrix A of size N x N find a B x B submatrix where B<= N and B>= 1, 
such that sum of all the elements in submatrix is maximum.

Problem Constraints
1 <= N <= 103.
1 <= B <= N
-100 <= A[i][j] <= 100.

Input Format
First arguement is an 2D integer matrix A.
Second argument is an integer B.

Output Format
Return a single integer denoting the maximum sum of submatrix of size B x B.

Example Input
Input 1:
A = [
        [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     ]
B = 3

Input 2:
A = [
        [2, 2]
        [2, 2]
    ]
B = 2



Output

Output 1:
48

Output 2:
8



Example Explanation

Explanation 1: Maximum sum 3 x 3 matrix is
    8 6 7
    4 4 4
    5 5 5
    Sum = 48

Explanation 2: Maximum sum 2 x 2 matrix is
  2 2
  2 2
  Sum = 8
*/
public class Maximum_Sum_Square_SubMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int i,j,maxSum = Integer.MIN_VALUE,sum = 0;
        int n = A.size();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        //sum row wise
        for(i = 0;i < n;i++){
            for(j = 1;j < n;j++){
                A.get(i).set(j, A.get(i).get(j - 1) + A.get(i).get(j));
            }
        }
        
        //sum column wise
        for(i = 0;i < n;i++){
            for(j = 1;j < n;j++){
                A.get(j).set(i, A.get(j - 1).get(i) + A.get(j).get(i));
            }
        }
        
        //Adding zeros in ArrayList res
        for(i = 0;i < n + 1;i++){
            res.add(new ArrayList<Integer>());
            for(j = 0;j < n + 1;j++){
                res.get(i).add(0);
            }
        }
        
        //Adding ArrayList A int ArrayList res
        for(i = 0;i < n;i++){
            for(j = 0;j < n;j++){
                res.get(i + 1).set(j + 1, A.get(i).get(j));
            }
        }
        
        //calculating the max sum
        for(i = B;i < n + 1;i++){
            for(j = B;j < n + 1;j++){
                sum = res.get(i - B).get(j) - res.get(i - B).get(j - B);
                sum += res.get(i).get(j - B) - res.get(i - B).get(j - B);
                sum += res.get(i - B).get(j - B);
                maxSum = Math.max(maxSum, res.get(i).get(j) - sum);
            }
        }
        return maxSum;
    }
}
