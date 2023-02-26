package com.daoxuanson;

import java.util.ArrayList;
import java.util.List;

public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int length = nums.length;
        int count = 1;
        List<Integer> temp = new ArrayList<>();
        while (j < length) {
            if (count < 3 ) {
                if (nums[i] == nums[j]){
                    temp.add(nums[j]);
                }
            }
            if (nums[i] == nums[j]) {
                j++;
                count++;

            }else {
                i = j;
                count = 1;
            }

        }

        for (int k = 0; k < temp.size(); k++) {
            System.out.println(temp.get(k) + " ");
            nums[k] = temp.get(k);
        }
        for (int k = temp.size(); k < length; k++) {
            nums[k] = 0;
        }

        return temp.size();
    }


    public static void main(String[] args) {
        System.out.println(new LeetCode80().removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
