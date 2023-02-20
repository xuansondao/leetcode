package com.daoxuanson;

import java.util.Stack;

public class LeetCode2289 {
    public static int totalSteps(int[] nums) {
        var st = new Stack<Integer>();
        st.push(0);
        int steps=0;
        int[] stepArray = new int[nums.length];
        for(int i=1;i<nums.length;i++){
            int max_steps = 0;
            while(!st.empty() && nums[i]>=nums[st.peek()]){
                max_steps=Math.max(max_steps,stepArray[st.peek()]);
                st.pop();
            }
            if(!st.empty() && nums[i]<nums[st.peek()]){
                stepArray[i]=1+max_steps;
            }
            steps = Math.max(steps,stepArray[i]);
            st.push(i);
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(totalSteps(new int[]{5,3,4,4,7,3,6,11,8,5,11}));
    }
}
