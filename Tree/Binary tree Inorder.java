// Java Program to calculate inorder of binary tree
// https://leetcode.com/problems/binary-tree-inorder-traversal/

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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inorder(root, arr);
        return arr;
    }
    
    public void inorder(TreeNode root, ArrayList arr){
        if(root != null){
            if(root.left != null)
                inorder(root.left, arr);
            arr.add(root.val);
            if(root.right != null)
                inorder(root.right, arr);
        }
    }
}
