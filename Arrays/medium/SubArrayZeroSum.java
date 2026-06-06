// Length of the longest subarray with zero Sum

// Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

// Examples
// Example 1:
// Input:
//  N = 6, array[] = {9, -3, 3, -1, 6, -5}  
// Result:
//  5  
// Explanation:
//  The following subarrays sum to zero:
// - {-3, 3}
// - {-1, 6, -5}
// - {-3, 3, -1, 6, -5}
// The length of the longest subarray with sum zero is 5.

// Example 2:
// Input:
//  N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}  
// Result:
//  8  
// Explanation:
//  Subarrays with sum zero:
// - {-2, 2}
// - {-8, 1, 7}
// - {-2, 2, -8, 1, 7}
// - {6, -2, 2, -8, 1, 7, 4, -10}
// The length of the longest subarray with sum zero is 8.

import java.util.HashMap;
import java.util.Map;

class SubArrayZeroSum{

    static int subZeroSum(int[] nums,int n){

        Map <Integer,Integer> sumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            
            sum += nums[i];

            if(sum == 0){
                maxLen = i+1;
            }

            if(sumMap.containsKey(sum)){
                int len = i - sumMap.get(sum);
                maxLen = Math.max(maxLen, len);
            }else{
                sumMap.put(sum , i);
            }
        }

     return maxLen;

    }
   
    public static void main(String[] a){
        int[] arr = {9, -3, 3, -1, 6, -5};
        int n = 6;
        System.out.println(subZeroSum(arr,n));
    }
}