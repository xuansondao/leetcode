package com.daoxuanson;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LeetCode220 {


    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff < 1 || valueDiff < 0) return false;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long) valueDiff + 1);
            if (map.containsKey(bucket)
                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= valueDiff)
                    || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= valueDiff))
                return true;
            if (map.entrySet().size() >= indexDiff) {
                long lastBucket = ((long) nums[i - indexDiff] - Integer.MIN_VALUE) / ((long) valueDiff + 1);
                map.remove(lastBucket);
            }
            map.put(bucket, remappedNum);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode220().containsNearbyAlmostDuplicate(new int[]{8,7,15,1,6,1,9,15}, 1, 3));
    }
}
