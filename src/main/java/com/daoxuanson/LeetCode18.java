package com.daoxuanson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int N = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<N; i++){
            if(i>0 && nums[i-1]==nums[i]) continue;

            for(int j=i+1; j<N; j++){
                if(j>i+1 && nums[j-1]==nums[j]) continue;
                int l = j+1, r = N-1;
                while(l<r){
                    if(nums[i]+nums[j]+nums[l]+nums[r] == target){
                        ArrayList<Integer> quad
                                = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        ans.add(quad);

                        if(l+1<r && nums[l+1]==nums[l])
                            while(l+1<r && nums[l]==nums[l+1]) l++;
                        else {
                            while(r-1>l && nums[r-1]==nums[r]) r--;
                        }

                        l++;
                    }
                    else if(nums[i]+nums[j]+nums[l]+nums[r] < target) l++;
                    else r--;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        fourSum(new int[]{1,0,-1,0,-2,2}, 0).forEach(list->{
            System.out.println("\n---------------\n");
            list.forEach(System.out::print);
        });
    }
}
