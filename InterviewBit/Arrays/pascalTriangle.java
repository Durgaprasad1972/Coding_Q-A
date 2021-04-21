/*
Given numRows = 5,

Return
[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]

*/
public class pascalTriangle{
    public ArrayList<ArrayList<Integer>> solve(int A) {
        int i,j,coeff = 0;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(i = 0;i < A;i++){
            al.add(new ArrayList<Integer>());
            for(j = 0;j <= i;j++){
                if(j == 0 || i == 0){
                    coeff = 1;
                    al.get(i).add(coeff);
                }
                else{
                    coeff = coeff * (i - j + 1)/j;
                    al.get(i).add(coeff); 
                }
            }
        }
        return al;
    }
}
