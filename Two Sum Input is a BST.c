// C Program to check two sum of BST
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int inorder(struct TreeNode* root, int* arr){
    static int ind;
    if(root == NULL) {
        return;
    }
    // LEFT
    inorder(root->left, arr);
    
    // Store current node
    arr[ind++] = root -> val;
    
    // RIGHT
    inorder(root->right, arr);
    return ind;
}

bool findTarget(struct TreeNode* root, int k) {
    int* arr = (int*) malloc(sizeof(int) * 100000);
    int ind = inorder(root, arr);
    int left = 0, right = ind-1;
    
    while(left < right) {
        if(arr[left] + arr[right] == k){
            return true;
        } else if (arr[left] + arr[right] < k) {
            left++;
        } else if(arr[left] + arr[right] > k) {
            right--;
        }
    }
    return false;
}
