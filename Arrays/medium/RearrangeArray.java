// Rearrange Array Elements by Sign

// Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

// Examples
// Example 1:
// Input:
// arr[] = {1,2,-4,-5}, N = 4
// Output:
// 1 -4 2 -5
// Explanation: 
// Positive elements = 1,2
// Negative elements = -4,-5
// To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.


// Example 2:
// Input:
// arr[] = {1,2,-3,-1,-2,-3}, N = 6
// Output:
// 1 -3 2 -1 3 -2
// Explanation: 
// Positive elements = 1,2,3
// Negative elements = -3,-1,-2
// To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
// Also, -3 should come before -1, and -1 should come before -2.

import java.util.Arrays;

class RearrangeArray{

    static int[] arranging(int[] nums,int n){

        int[] resultArr = new int[n];

        int neg = 1;
        int pos = 0;
        int idx = 0;
        while(idx < n){

            if(nums[idx] < 0){
                // resultArr[neg = neg + 2] = nums[idx];
                resultArr[neg] = nums[idx];
                neg += 2;
            }else{
                // resultArr[pos = pos + 2] = nums[idx];
                resultArr[pos] = nums[idx];
                pos += 2;
            }

            idx++; 

        }
        return resultArr;
    }

    public static void main(String[] a){
        // int arr[] = {1,2,-4,-5};
        int arr[] = {1,2,-3,-1,-2,3};
        int n = 6;
        System.out.println(Arrays.toString(arranging(arr, n)));
    }

}