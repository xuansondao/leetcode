package com.daoxuanson;

public class LeetCode74 {
    public int binarySearch(int[][] nums, int target,int index ,boolean findInStartIndex){
        int start = 0 ;
        int end =  nums[index].length - 1;
        int ans = -1;
        int middle;
        while (start <= end){
            middle = start + (end - start)/2;
            if (nums[index][middle] < target){
                start = middle + 1;
            }else if (nums[index][middle] > target){
                end = middle - 1;
            }else {
                ans = middle;
                if (findInStartIndex){
                    end = middle - 1;
                }else {
                    start = middle + 1;
                }
            }
        }


        return ans;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int index = binarySearch(matrix, target, i, true);
            if (index >= 0){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode74().searchMatrix(new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3));
    }
}
