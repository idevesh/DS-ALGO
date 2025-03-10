function mergeAlternately(word1: string, word2: string): string {
    if(!word1) return word2;
    if(!word2) return word1;

    let finalStr = '';
    if(word1.length >= word2.length) {
        word1.split('').forEach((str: string, index: number) => {
            if(word2[index])
                finalStr += str + word2[index];
            else
                finalStr += str;
        })
    } else {
        let indexNum = 0;
        word1.split('').forEach((str: string, index: number) => {
            finalStr += str + word2[index];
            indexNum = index;
        })

        finalStr += word2.substring(indexNum+1, word2.length);
    }

    return finalStr;
};