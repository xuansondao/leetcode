package com.daoxuanson;

public class LeetCode700 {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
    
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val==val) {
            return root;
        }
        else if (root.val<val) {
            root = root.right;
        }
        else {
            root = root.left;
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
