// Java Code to find out postorder traversal of binary tree.
// https://leetcode.com/problems/binary-tree-postorder-traversal

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        if(root == null) return output;
        calculatePostOrder(root, output);
        return output;
    }
    
    public void calculatePostOrder(TreeNode root, List<Integer> output){
        if(root == null) return;
        calculatePostOrder(root.left, output);
        calculatePostOrder(root.right, output);
        output.add(root.val);
        return;
    }
}
