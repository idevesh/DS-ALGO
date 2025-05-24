function findWordsContaining(words: string[], x: string): number[] {
    let arrFinal = []; 
    words.forEach((item: string, index: number) => {
        if(item.includes(x)) {
            arrFinal.push(index);
        }
    })
    return arrFinal;
};