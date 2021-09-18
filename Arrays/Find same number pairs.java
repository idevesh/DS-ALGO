/*package whatever //do not write package name here */

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class GFG {
	public static void main (String[] args) {
	    int arr[] = {1, 2, 2, 1,2};
        int n = arr.length;
        System.out.println(cntgloves(arr, n));
	}
	
	static boolean cntgloves(int arr[], int n)
    {
        if(arr.length % 2 != 0){
            return false;
        }
        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i =0; i<arr.length; i++){
            int value = arr[i];
            if(hashtable.containsKey(value)){
                int v = hashtable.get(value);
                v++;
                hashtable.put(value, v);
                
            } else {
                hashtable.put(arr[i], 1);
            }
        }

        
        for (Map.Entry<Integer, Integer> set :
             hashtable.entrySet()) {
            if(set.getValue() % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
