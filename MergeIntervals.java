/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> op = new ArrayList<Interval>();
        if(intervals.size() == 0) {
            return op;
        }
        // Sort the list        
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return (o1.start - o2.start);
            }
        });
        
        // compute the intervals
        
        int min = intervals.get(0).start;
        int max = intervals.get(0).end;
        for (int i = 0; i < intervals.size(); i++) {
            if(intervals.get(i).start <= max) {                
                if (max < intervals.get(i).end) {
                    max = intervals.get(i).end;
                }                
            }
            else {
                // Create one component with min & max
                Interval merged = new Interval(min,max);
                op.add(merged);
                // set current min and max values
                min = intervals.get(i).start;
                max = intervals.get(i).end;
            }
             
        }
        Interval merged = new Interval(min,max);
        op.add(merged);
        return op;
    }
}