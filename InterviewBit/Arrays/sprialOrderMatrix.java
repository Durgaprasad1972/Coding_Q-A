/*Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:
Given the following matrix:
[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]

You should return
[1, 2, 3, 6, 9, 8, 7, 4, 5]

*/

public class sprialOrderMatrix {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int T = 0,B = A.size() - 1,L = 0,R = A.get(0).size() - 1;
        int dir = 0,i;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(T <= B && L <= R){
            if(dir == 0){
                for(i = L;i <= R;i++){
                    result.add(A.get(T).get(i));
                }
                T++;
                dir = 1;
            }
            else if(dir == 1){
                for(i = T; i <= B;i++){
                    result.add(A.get(i).get(R));
                }
                R--;
                dir = 2;
            }
            else if(dir == 2){
                for(i = R;i >= L;i--){
                    result.add(A.get(B).get(i));
                }
                B--;
                dir = 3;
            }
            else if(dir == 3){
                for(i = B;i >= T;i--){
                    result.add(A.get(i).get(L));
                }
                L++;
                dir = 0;
            }
        }
        return result;
    }
}
