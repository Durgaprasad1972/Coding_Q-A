/* 
Problem Description
Given a sorted array A containing N integers both positive and negative.
You need to create another array containing the squares of all the elements in A and return it in non-decreasing order.
Try to this in O(N) time.

Problem Constraints
1 <= N <= 105.
-103 <= A[i] <= 103

Input Format
First and only argument is an integer array A.

Output Format
Return a integer array as described in the problem above.

Example Input

Input 1:
 A = [-6, -3, -1, 2, 4, 5]

Input 2:
 A = [-5, -4, -2, 0, 1]

Example Output

Output 1:
 [1, 4, 9, 16, 25, 36]

Output 2:
 [0, 1, 4, 16, 25]
*/
public class Sort_array_with_squares {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int i = 0, j = A.size() - 1;
        ArrayList<Integer> B = new ArrayList<Integer>();
        if(j + 1 == 1){
            B.add((int)Math.pow(A.get(j), 2));
            return B;
        }
        while(i <= j){
            if(Math.abs(A.get(i)) < Math.abs(A.get(j))){
                B.add((int)Math.pow(A.get(j), 2));
                j--;
            }
            else{
                B.add((int)Math.pow(A.get(i), 2));
                i++;
            }
        }
        Collections.reverse(B);
        return B;
    }
}
