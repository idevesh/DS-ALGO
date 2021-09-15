// C Program to implement move zeroes
// https://leetcode.com/problems/move-zeroes



void moveZeroes(int* nums, int size){
    if(size == 1){
        return;
    }
    
    int zeros = 0;
    for(int i=0; i<size; i++) {
        if(nums[i] == 0) {
            zeros++;
        }
    }
    
    if(size == zeros) {
        return;
    }
    
    for(int i = 0; i < size; i++){
        if(nums[i] != 0){
            continue;
        } else {
            for(int j = i + 1; j < size; j++){
                if(nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
    }
    
    for(int i = size-1; i > size - zeros - 1; i--){
        nums[i] = 0;
    }
}
