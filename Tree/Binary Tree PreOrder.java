// Java Code to find out preorder traversal of binary tree
// https://leetcode.com/problems/binary-tree-preorder-traversal/

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        preOrder(root, arr);
        return arr;
    }
    
    public void preOrder(TreeNode root, List arr){
        if(root != null){
            arr.add(root.val);
            if(root.left != null)
                preOrder(root.left, arr);
            if(root.right != null)
                preOrder(root.right, arr);
        }
    }
}
