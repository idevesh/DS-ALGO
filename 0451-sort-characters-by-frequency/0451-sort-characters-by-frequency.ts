function frequencySort(s: string): string {
    if(s.length === 1) return s
    if(s.length === 2) return s

    let output = ""
    let map = new Map()
    for(let i = 0; i < s.length; i++){
        if(!map.has(s[i])) {
            map.set(s[i], 1)
        } else {
            map.set(s[i], map.get(s[i]) + 1)
        }
    }

    const mapSort = new Map([...map.entries()].sort((a, b) => b[1] - a[1]));
    mapSort.forEach((value: number, key: string) => {
        output += key.repeat(value)        
    });
    
    return output
};