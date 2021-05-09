/*
Given a number N, find all prime numbers upto N ( N included ).
Make sure the returned array is sorted.

Example:
if N = 7,
all primes till 7 = {2, 3, 5, 7}
*/

public class Prime_Numbers {
    public ArrayList<Integer> sieve(int A) {
        int i,j;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        
        // 0 and 1 are not prime
        primes.add(0);
        primes.add(0);
        
        for(i = 2;i < A + 1;i++){
            primes.add(1);
        }
        
        for(i = 2;i < primes.size();i++){
            if(primes.get(i) == 1){
                for(j = 2; i * j <= A;j++){
                    primes.set(i * j, 0);
                }
                result.add(i);
            }
        }
        return result;
    }
}

