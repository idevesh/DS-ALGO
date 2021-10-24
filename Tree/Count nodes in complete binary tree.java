// Java code to count all nodes in complete binary tree efficiently
// https://leetcode.com/problems/count-complete-tree-nodes

class Solution {
    int count = 0;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        countNodes(root, root);
        return count;
    }
    
    public void countNodes(TreeNode root, TreeNode parent){
        if(root == null) return;
        count++;
        if(parent.left != null)
            countNodes(root.left, root);
        if(parent.right != null)
            countNodes(root.right, root);
    }
}
