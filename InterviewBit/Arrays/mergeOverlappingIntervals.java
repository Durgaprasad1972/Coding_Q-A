/* 
Given a collection of intervals, merge all overlapping intervals.

For example:
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
*/

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
      if (intervals == null) return null;
      int i,x,y;
      ArrayList<Interval> result = new ArrayList<>();
     
      // sort list by interval's start time
      Collections.sort(intervals, new Comparator<Interval>(){
        @Override
        public int compare(Interval o1, Interval o2) {
          if (o1.start != o2.start) {
            return o1.start - o2.start;
          }
          else{
             return o1.end - o2.end;
          }
         }
        });
      for(i = 1;i <intervals.size();i++){
            Interval current = intervals.get(i);
            Interval previous = intervals.get(i - 1);
            x = Math.max(previous.start,current.start);
            y = Math.min(previous.end,current.end);
            if(x > y){
              //previous do not overlap with current
              result.add(previous);
            }
            else{
                //remove interval at index i
                previous.start = Math.min(previous.start,current.start);
                previous.end = Math.max(previous.end,current.end);
                intervals.remove(i);
                i--;
            }
      }
      result.add(intervals.get(intervals.size() - 1));
      return result;
