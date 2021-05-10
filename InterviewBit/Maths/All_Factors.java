/*
Given a number N, find all factors of N.

Example:
N = 6 
factors = {1, 2, 3, 6}

Make sure the returned array is sorted.
*/
public class All_Factors {
    public ArrayList<Integer> allFactors(int A) {
        int i = 0,a = 0;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        int n = (int)Math.sqrt(A);
        for(i = 2;i <= n;i++){
            if(A % i == 0){
                result.add(i);
            }
        }
        for(i = result.size() - 1;i >= 0;i--){
            a = A/result.get(i);
            if(result.get(i) != a){
                result.add(a);
            }
        }
        return result;
    }
}
