function removeDuplicates(nums: number[]): number {
    if(nums.length === 0) return 0
    if(nums.length === 1) return 1
    
    let index = 1
    for(let i = 0; i < nums.length-1; i++) {
        if(nums[i] !== nums[i+1]){
            nums[index++] = nums[i+1]
        }
    }
    return index
};