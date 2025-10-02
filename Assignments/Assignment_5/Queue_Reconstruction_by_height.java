package Assignments.Assignment_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queue_Reconstruction_by_height {
    public static void main(String[] args) {
        int people[][]={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int ans[][]=reconstructQueue(people);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i][0]+" ");
            System.out.print(ans[i][1]+", ");
        }
    }
    public static int[][] reconstructQueue(int[][] people) {
         Arrays.sort(people, (a, b) -> {
           return (a[0] == b[0])? a[1] - b[1] : b[0] - a[0];
        });

        
        List<int[]> result = new LinkedList<>();
        for (int[] person : people) {
            result.add(person[1], person);
        }

        return result.toArray(new int[people.length][]);
    }
}
