/*
Given an integer A, generate a square matrix filled with elements from 1 to A in spiral order.

Input Format:
The first and the only argument contains an integer, A.

Output Format:
Return a 2-d matrix of size A x A satisfying the spiral order.

Constraints:
1 <= A <= 1000

Examples:
Input 1:
    A = 3

Output 1:
    [   [ 1, 2, 3 ],
        [ 8, 9, 4 ],
        [ 7, 6, 5 ]   ]

Input 2: A = 4
Output 2:
    [   [1, 2, 3, 4],
        [12, 13, 14, 5],
        [11, 16, 15, 6],
        [10, 9, 8, 7]   ]
*/


public class spiralOrderMatrix2{
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int arr[][] = new int [A][A];
        // marking boundaries
        int top=0, bottom=A-1, left=0, right=A-1;
        int direction = 0, count = 1;
        // direction = 0 means moving left to right
        // direction = 1 means moving top to bottom
        // direction = 2 means moving left to right
        // direction = 3 means moving bottom to top
        while(left<=right && top<=bottom) {
            if(direction==0) {
                for(int i=left; i<=right; i++) {
                    arr[top][i] = count;
                    count++;
                }
                top++;
                direction = 1;
            } else if(direction==1) {
                for(int i=top; i<=bottom; i++) {
                    arr[i][right] = count;
                    count++;
                }
                right--;
                direction = 2;
            } else if(direction==2) {
                for(int i=right; i>=left; i--) {
                    arr[bottom][i] = count;
                    count++;
                }
                bottom--;
                direction = 3;
            } else if(direction==3) {
                for(int i=bottom; i>=top; i--) {
                    arr[i][left] = count;
                    count++;
                }
                left++;
                direction = 0;
            } 
        }
        
        // converting spiral array into list of list.
        ArrayList<ArrayList<Integer>> finalList = new ArrayList();
        for(int i=0;i<A;i++) {
            ArrayList<Integer> list = new ArrayList();
            for(int j=0;j<A;j++) {
                list.add(arr[i][j]);
            }
            finalList.add(list);
        }
        
        return finalList;
    }
}

