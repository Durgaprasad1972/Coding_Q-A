/*
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.
*/
/*
public class Interval{
  int start;
  int end;
  Interval(){
    start = 0;
    end = 0;
  }
  Interval(int a,int b){
    start = a;
    end = b;
  }
}
*/
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int i;
        if(intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }
        //LinkedList<Interval> intervals = new LinkedList<>(inter);
        for(i = 0;i < intervals.size();){
            Interval current = intervals.get(i);
            if(current.end < newInterval.start){
                i++;
                continue;
            }
            else if(newInterval.end < current.start){
                intervals.add(i,newInterval);
                break;
            }
            else{
                newInterval.start = Math.min(newInterval.start,current.start);
                newInterval.end = Math.max(newInterval.end,current.end);
                intervals.remove(i);
            }
        }
        if(i == intervals.size()){
            intervals.add(newInterval);
        }
        return intervals;
    }
}
