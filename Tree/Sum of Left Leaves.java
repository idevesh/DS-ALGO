// Java code to find sum of all left nodes in a tree
// https://leetcode.com/problems/sum-of-left-leaves

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        calculate(root, false, root);
        return sum;
    }
    
    public void calculate(TreeNode root, Boolean isRight, TreeNode realRoot){
        if(root != null){
            if(root.left != null)
                calculate(root.left, false, realRoot);
            else if(root.left == null && root.right == null && isRight == false && root != realRoot){
                sum = sum + root.val;
                System.out.print(sum+" ");
            }
            if(root.right != null)
                calculate(root.right, true, realRoot);
        }
    }
}
