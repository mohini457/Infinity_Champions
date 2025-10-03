package Assignments.Assignment_6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<List<Integer>> ll=combine(n, k);
        System.out.println(ll);
        
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int n, int k, List<Integer> path, List<List<Integer>> result) {
        if (k==0) {
            result.add(new ArrayList<>(path));  
            return;
        }

        for (int i = start; i <= n-k+1; i++) {
            path.add(i);                       
            backtrack(i + 1, n, k-1, path, result);
            path.remove(path.size() - 1);       
        }
    }
}
