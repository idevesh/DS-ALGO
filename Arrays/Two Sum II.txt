// C Code to find two sum using binary search approach
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize){
    int left = 0, right = numbersSize - 1, index = 0;
    int *result = (int*) malloc(sizeof(int) * 2);
    while(left < right) {
        if(numbers[left] + numbers[right] == target){
            result[index++] = left+1;
            result[index] = right+1;
            *returnSize = 2;
            return result;
        } else if(numbers[left] + numbers[right] < target) {
            left++;
        } else if(numbers[left] + numbers[right] > target) {
            right--;
        }
    }
    
    *returnSize = 0;
    return 0;
}
