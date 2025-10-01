package Assignments.Assignment_5;

import java.util.Arrays;
import java.util.Comparator;

public class Non_overlapping_Intervals {
    public static void main(String[] args) {
        int intervals[][]={{1,2},{2,3},{3,4},{1,3}};
        System.out.print(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparing(a->a[1]));

        int last=intervals[0][1];
        int remove=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<last){
                remove++;
            }

            else{
                last=intervals[i][1];

            }
        }
        return remove;
    }
}
