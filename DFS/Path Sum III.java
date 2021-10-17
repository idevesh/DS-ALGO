// Java code to find path sum is equal to any given number or not
// https://leetcode.com/problems/path-sum-iii/

class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        traverseSubTree(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        
        return count;
    }
    
    public void traverseSubTree(TreeNode root, int targetSum, int currSum){
        if(root == null) return;
        
        currSum = currSum + root.val;
        
        if(currSum == targetSum){
            count++;
        }
        
        traverseSubTree(root.left, targetSum, currSum);
        traverseSubTree(root.right, targetSum, currSum);
    }
}
