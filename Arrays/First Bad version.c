// C code to find first bad version
// https://leetcode.com/problems/first-bad-version/

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    int low = 0;
    long int high = n;
    while(low < high){
        int mid = low + (high - low)/2;
        if(isBadVersion(mid) == false && isBadVersion(mid+1) == true) {
            return mid+1;
        } else if(isBadVersion(mid) == false) {
            low = mid+1;
        } else {
            high = mid;
        }
    }
    return 0;
}
