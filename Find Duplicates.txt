// https://leetcode.com/problems/contains-duplicate/
// C CODE (TLE) Problem | HASHMAP
bool containsDuplicate(int* arr, int numsSize){
    int hash[numsSize];
    int hashSize = -1;
    for(int i = 0; i < numsSize; i++)
    {
        if(hashSize == -1){
            hash[++hashSize] = arr[i];
            continue;
        } else {
            for(int j = 0; j <= hashSize; j++){
                if(arr[i] == hash[j]){
                    return true;
                }
            }
        }
        hash[++hashSize] = arr[i];
    }
    
    if(numsSize == hashSize){
        return false;
    }
    return false;
}

// C++ CODE One line
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        if(nums.size() > set<int>(nums.begin(), nums.end()).size()) {
            return true;
        } else {
            return false;
        }
    }
};
