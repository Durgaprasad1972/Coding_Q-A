/* 
Given a positive integer n and a string s consisting only of letters D or I, 
you have to find any permutation of first n positive integer that satisfy the given input string.
D means the next number is smaller, while I means the next number is greater.

Notes
    Length of given string s will always equal to n - 1
    Your solution should run in linear time and space.

Input 1:

n :  5
s = DIDD
Return: [5, 1, 4, 3, 2]
*/

public class findPermutation{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int i,start = 1,end = B;
        List<Integer> al = new ArrayList<Integer>(A.length());
        for(i = 0;i < A.length();i++){
            if(A.charAt(i) == 'I'){
                al.add(start);
                start++;
            }
            else{
                al.add(end);
                end--;
            }
        }
        al.add(start);
        return new ArrayList<Integer>(al);
    }
}
