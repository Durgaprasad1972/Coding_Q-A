/*
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.

Example:
Input:[3 1 2 5 3] 

Output:[3, 4] 
A = 3, B = 4
*/

public class Repeat_and_Missing_Number_Array{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int i,a = 0,b;
        long sum, sumA = 0, diff;
        ArrayList<Integer> out = new ArrayList<Integer>();
        int n = A.size();
        
        //get sum only in long not float
        if(n % 2 == 0){
            sum = (n/2) * (n + 1);
        }
        else{
            sum = n * ((n + 1)/2);
        }
        
        HashSet<Integer> ASet = new HashSet<Integer>();
        for(i=0;i<A.size();i++) {
            if(ASet.contains(A.get(i))) {
                a = A.get(i);
            }
            ASet.add(A.get(i));
            sumA = sumA + (long) A.get(i);
        }
        diff = sumA - sum;
        b = a - (int)diff;
        out.add(a);
        out.add(b);
        return out;
    }
}
