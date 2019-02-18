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
    public int minMeetingRooms(Interval[] intervals) {
        List<Interval> rooms = new ArrayList<Interval>();
        List<Interval> input = new ArrayList<Interval>();
        if (intervals.length == 0) {
            return 0;
        }
        for (int i = 0; i < intervals.length; i++) {
            input.add(intervals[i]);
        }
        // Sorting the inputs
        Collections.sort(input, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        
        for (int i = 0; i < input.size(); i++) {
            Interval current = input.get(i);
            if (rooms.size() == 0) {
                Interval r = new Interval(current.start, current.end);
                rooms.add(r);
            }            
            else {
                if (!isAvailable(rooms, current)) {
                // Add room
                    Interval r = new Interval(current.start, current.end);
                    rooms.add(r);
                }
            }            
        }     
        return rooms.size();
    }
    
    public boolean isAvailable(List<Interval> rooms, Interval current) {
        for (int j = 0; j < rooms.size(); j++) {
                if (current.start >= rooms.get(j).end) {
                    rooms.get(j).start = current.start;
                    rooms.get(j).end = current.end;
                    return true;
                }
            }
        return false;
    }
}