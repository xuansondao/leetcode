package com.daoxuanson;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78 {
    public List<List<Integer>> lt=new ArrayList<>();
    public void powerSet(int[] nums, int idx, List<Integer> ds) {
        if (idx == nums.length) {
            lt.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        powerSet(nums, idx + 1, ds);
        ds.remove(ds.size() - 1);
        powerSet(nums, idx + 1, ds);
    }

    public List<List<Integer>> subsets(int[] nums) {
        powerSet(nums, 0, new ArrayList<Integer>());
        return lt;
    }
}
