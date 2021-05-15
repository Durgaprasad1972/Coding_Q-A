/*
Given a positive integer which fits in a 32 bit signed integer, 
find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example
Input : 4
Output : True  
as 2^2 = 4. 

*/
public class Power_Of_Two_Integers {
    public int isPower(int A) {
        int i;
        //double num = 0.0;
        int num;
        if(A == 1){
            return 1;
        }
        
        for(i = 2;i <= (int)Math.sqrt(A);i++){
            double n = Math.round(Math.pow(A,1.0/(double)i) * 10000d)/10000d;
            if(n % 1 == 0){
                return 1;
            }
        }
        return 0;
    }
}
