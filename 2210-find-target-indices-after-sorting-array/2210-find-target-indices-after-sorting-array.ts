function targetIndices(nums: number[], target: number): number[] {
    nums = nums.sort((a, b) => a - b);
    let output = [];
    nums.forEach((item: number, index: number) => {
        if (item === target) {
            output.push(index);
        }
    })

    return output;
};