/*
Input : k = 3
Return : [1,3,3,1]
*/
public class pascalTriangleKthRow {
    public ArrayList<Integer> getRow(int A) {
        int i,j,coeff = 1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(j = 0;j < A;j++){
            if(j == 0){
                coeff = 1;
                result.add(coeff);
            }
            else{
                coeff = coeff * (A - j + 1)/j;
            }
        }
    }
}
