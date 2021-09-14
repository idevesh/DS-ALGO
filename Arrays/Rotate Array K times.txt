// C Code to rotate and array K times 
// https://leetcode.com/problems/rotate-array/

void rotate(int* nums, int numsSize, int k){
    k = k % numsSize;
    if(k == numsSize || k == 0)
        return;
    
    int i = 0;
    int j = numsSize-k - 1;
    int t;
    while(i < j) {
        t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        i++;
        j--;
    }
    i = numsSize - k;
    j = numsSize - 1;
    while(i < j) {
        t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        i++;
        j--;
    }
    i = 0;
    j = numsSize - 1;
    while(i < j) {
        t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        i++;
        j--;
    }
}
