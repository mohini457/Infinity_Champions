package Assignments.Assignment_5;

import java.util.Arrays;
import java.util.Comparator;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int points[][]={{10,16},{2,8},{1,6},{7,12}};
        System.out.print(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        if(points.length==1) return 1;
        


        Arrays.sort(points, Comparator.comparing(a-> a[1]));
        int arrow=1;
        int last=points[0][1];

        for(int i=0;i<points.length;i++){
            if(points[i][0]>last){
                arrow++;
                last=points[i][1];
            }
        }
        return arrow;
    }
}
