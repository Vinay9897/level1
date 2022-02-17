package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        combinationSum(nums, target);
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),nums,target,0);
        return list;
    }

    public static List<Integer> backtrack(List<List<Integer>> list)
}