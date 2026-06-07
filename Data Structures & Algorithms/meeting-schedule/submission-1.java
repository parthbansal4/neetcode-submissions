/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a,b) -> a.start - b.start);

        for(int i=0;i<intervals.size()-1;i++){
            Interval currInterval = intervals.get(i);
            Interval nextInterval = intervals.get(i+1);

            if(!(currInterval.end <= nextInterval.start)){
                return false;
            }

        }

        return true;
    }
}
