// C program to reverse a full string
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

void reverse(char *s, int start, int end){
    while(start < end) {
        // Reverse only if both diff
        if(s[start] != s[end]){
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
        }
        start++;
        end--;
    }
}

char * reverseWords(char * s){
    int start = 0;
    int current = 0;
    while(s[current] != '\0') {
        if(s[current] == ' ') {
            reverse(s, start, current-1);
            start = current+1;
        }
        current++;
    }
    
    // While Loop will terminate so will 
    // have to call again 
    // For the last word
    reverse(s, start, current-1);
    return s;
}
