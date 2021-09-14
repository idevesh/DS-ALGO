// C Code to find square of a sorted array
// https://leetcode.com/problems/squares-of-a-sorted-array/


int *sortedSquares(int *nums, int numsSize, int *returnSize){
    int i,j,key;
    int *result = malloc(numsSize*sizeof *result);
    *returnSize = numsSize;
    
    if(nums[0] >= 0){
        for(i=0; i<numsSize; i++){
            result[i] = nums[i]*nums[i];
        }
        return result;
    }
    else{
        for(i=0; i<numsSize; i++){
            result[i] = nums[i]*nums[i];
        }

        // Insertion Sort
        // Best Case - O(n)
        // Worst Case - O(n^2)

        for(i=1; i<numsSize; i++){
            key = result[i];
            j = i-1;

            while(j >= 0 && result[j] > key){
                result[j+1] = result[j];
                j = j-1;
            }
            result[j+1] = key;
        }
        return result;
    }
}
