/*
Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,
[3,4,-1,1] return 2,
[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.

*/
public class first_Missing_Integer{
    public int firstMissingPositive(ArrayList<Integer> A) {
        int i, num, pos, n = A.size();
        for (i = 0; i < A.size(); i++) {
            num = A.get(i);
            pos = num - 1;
            
            if (pos >= 0 && pos < n && A.get(pos) != num) {
                Collections.swap(A, i, pos);
                i--;
            }
        }
        
        for (i = 0; i < n; i++)
            if (A.get(i) != i + 1)
                return i + 1;
        
        return n + 1;
    }
}
