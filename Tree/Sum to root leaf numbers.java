// Java program to find sum of root to leaf of all parts
// https://leetcode.com/problems/sum-root-to-leaf-numbers/

class Solution {
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        
        return calculateSum(root, 0);
    }
    
    public int calculateSum(TreeNode root, int sum){
        if(root == null) return 0;
        
        sum = sum*10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return calculateSum(root.left, sum) + calculateSum(root.right, sum);
    }
}
