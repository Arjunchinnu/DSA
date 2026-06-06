// Kadane's Algorithm : Maximum Subarray Sum in an Array

// Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Examples
// Example 1:
// Input:
//  nums = [2, 3, 5, -2, 7, -4]  
// Output:
//  15  
// Explanation:
//  The subarray from index 0 to index 4 has the largest sum = 15, which is the maximum sum of any contiguous subarray.

// Example 2:
// Input:
//  nums = [-2, -3, -7, -2, -10, -4]  
// Output:
//  -2  
// Explanation:
//  The largest sum is -2, which comes from taking the element at index 0 or index 3 as the subarray. Since all numbers are negative, the subarray with the least negative number gives the largest sum.

public class KadansMaximum {
    
    static int findMax(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];
        int right= 1;

        while(right < nums.length){

            currSum += nums[right];
            
            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0){
                currSum = 0;
            }

             right++;
        }
        return maxSum;
    }
    public static void main(String[] a){
        int[] arr = {2,3,5,-2,7,-4};
        // int[] arr = {-2, -3, -7, -2, -10, -4};
        System.out.println(findMax(arr));

    }
}
