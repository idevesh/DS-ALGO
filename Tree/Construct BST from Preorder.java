// Java code to create BST using the preorder traversal of the BST given
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal

class Solution {
    TreeNode root;
    public TreeNode bstFromPreorder(int[] preorder) {
        for(int n: preorder){
            root = addNode(root, n);
        }
        return root;
    }
    
    public TreeNode addNode(TreeNode root, int n){
        if(root == null) return new TreeNode(n);
        if(n > root.val){
            root.right = addNode(root.right, n);
        } else if (n < root.val){
            root.left = addNode(root.left, n);
        }
        return root;
    }
}
