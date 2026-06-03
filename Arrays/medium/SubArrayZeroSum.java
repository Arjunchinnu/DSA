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

class SubArrayZeroSum{

    static int subZeroSum(int[] arr,int n){

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i;j < arr.length;j++){
                int sum = 0;
                int count = 0;

                for(int k = i;k<=j;k++){
                    sum += arr[k];
                    count++;
                }
                if(sum == 0 && count > max){
                    max = count;
                }
            }
        }

        return max;
    }

    public static void main(String[] a){
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = 8;
        System.out.println(subZeroSum(arr,n));
    }
}