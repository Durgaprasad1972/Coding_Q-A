/*
Problem Description
Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.
Given an array A of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array. 
Return the answer modulo 1000000007.

Problem Constraints
1 <= |A| <= 200000
1 <= A[i] <= 109

Input Format
First and only argument is array A.

Output Format
Return one integer, the answer to the problem.

Example Input

Input 1:
A = [1]

Input 2:
A = [2, 4, 6]

Example Output

Output 1:
0

Output 2:
8

Example Explanation

Explanation 1:
No pairs are formed.

Explanation 2:
We return, f(2, 2) + f(2, 4) + f(2, 6) + f(4, 2) + f(4, 4) + f(4, 6) + f(6, 2) + f(6, 4) + f(6, 6) = 8

*/
public class Sum_of_pairwise_Hamming_Distance {
    public int hammingDistance(final List<Integer> A) {
        int n = A.size();
        int dist = 0;
        for(int i = 0; i < 31; i++) {
            int oneCount = 0;
            for(int j = 0; j < n; j++) {
                int num = A.get(j);
                oneCount += (num & 1 << i) != 0? 1 : 0;
            }
            int zeroCount = n - oneCount;
            dist += (2L * oneCount * zeroCount) % 1000000007;
            dist = dist % 1000000007;
        }
        return dist;
    }
}