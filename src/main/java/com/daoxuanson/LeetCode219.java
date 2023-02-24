package com.daoxuanson;

import java.util.HashMap;
import java.util.Map;

public class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k && i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) - i <= k) {
               return true;
            }
            map.put(nums[i], i);
        }
        for (int i = k; i < nums.length; i++) {
            if (map.containsKey(nums[i]) &&  map.get(nums[i]) - i <= k) {
                return true;
            }
            map.remove(nums[i-k]);
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode219().containsNearbyDuplicate(new int[]{1,2,3,4,5,6,7,8,9,10}, 15));
    }
}
