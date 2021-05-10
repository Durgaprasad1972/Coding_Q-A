/*
You’re given a read only array of n integers. 
Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.

Example :

Input : [1 2 3 1 1]
Output : 1 
1 occurs 3 times which is more than 5/3 times. 

*/
mport java.util.stream.*;
import java.util.stream.Collectors;
public class repeat_Number {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int i;
        Map<Integer, Long> countMap = a.stream().collect(Collectors.groupingBy(s -> s, 
                        Collectors.counting()));
        int value = a.size()/3;
        for(i = 0;i < a.size();i++){
            if(countMap.get(a.get(i)) >= value){
                return a.get(i);
            }
        }
        return -1;
    }
}
