package Assignments.Assignment_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_2 {
    public static void main(String[] args) {
        int candidates[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ll=combinationSum2(candidates, target);
        System.out.println(ll);
        
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break; 

            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
