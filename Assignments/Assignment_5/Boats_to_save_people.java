package Assignments.Assignment_5;

import java.util.Arrays;

public class Boats_to_save_people {
    public static void main(String[] args) {
        int people[]={3,2,2,1};
        int limit=3;
        System.out.print(numRescueBoats(people, limit));
        
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
            }
            else{
                right--;
            }
            boats++;
        }
        return boats;
    }
}
