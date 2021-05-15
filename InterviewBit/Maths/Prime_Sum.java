/*
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
NOTE A solution will always exist. read Goldbach’s conjecture

Example:
Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.
If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 
If a < c OR a==c AND b < d. 
*/
public class Prime_Sum{
    public ArrayList<Integer> primesum(int A) {
        int i,ans = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        if(A <= 2 || A % 2 == 1){
            return result;
        }
        if(A == 4){
            result.add(2);
            result.add(2);
            return result;
        }
        for(i = 3;i < A/2;i = i + 2){
            if(isprime(i) && isprime(A - i)){
                result.add(i);
                result.add(A - i);
                return result;
            }
        }
        return result;
    }
    
    public static boolean isprime(int i){
        int j;
        if(i == 3){
            return true;
        }
        
        for(j = 5;j <= (int) Math.sqrt(i);j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
