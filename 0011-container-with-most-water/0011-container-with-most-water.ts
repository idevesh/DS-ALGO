function maxArea(height: number[]): number {
    let maxArea = 0;
    // Bruteforce
    // height.forEach((h1: number, i1: number) => {
    //     height.forEach((h2: number, i2: number) => {
    //         if (i2 > i1) {
    //             maxArea = Math.max(maxArea,
    //                 Math.min(h1, h2) * (i2 - i1))
    //         }
    //     })
    // })

    // Two Pointer
    let p1 = 0, p2 = height.length - 1;
    do {
        maxArea = Math.max(maxArea,
            Math.min(height[p1], height[p2]) * Math.abs(p1 - p2));
        if (height[p1] < height[p2]) p1++;
        else p2--;
    } while (p1 !== p2)

    return maxArea;
};