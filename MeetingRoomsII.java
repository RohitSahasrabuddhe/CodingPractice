
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class MeetingRoomsII {
    public int minMeetingRooms(Interval[] intervals) {
        int maxEnd = findMaxEnd(intervals);
        int count = 0;
        for (int i = 0; i < maxEnd; i++) {
            int current = getMeConflicts(intervals, i);
            if (current > count) {
                count = current;
            }
        }
        return count;
    }
    public int getMeConflicts(Interval[] intervals, int time) {
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i].start <= time && intervals[i].end > time) {
                count++;
            }
        }
        return count;
    }
    public int findMaxEnd(Interval[] intervals) {
        int maxEnd = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i].end > maxEnd) {
                maxEnd = intervals[i].end;
            }
        }
        return maxEnd;
    }
}