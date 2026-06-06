// Sort an array of 0s, 1s and 2s



// Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.

// Examples
// Input: nums = [1, 0, 2, 1, 0]
// Output: [0, 0, 1, 1, 2]
// Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

// Input: nums = [0, 0, 1, 1, 1]
// Output: [0, 0, 1, 1, 1]
// Explanation: The nums array in sorted order has 2 zeroes, 3 ones and zero twos.

import java.util.Arrays;

public class SortZerosOnces {

    static void sortZerosandOnces(int[] arr){
        int left = 0;
        int mid = 0;
        int right = arr.length -1;

        while(mid <= right){

            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;

                left++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;

                right--;
            }

            
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {

        int[] arr = {1,0,2,1,0};
        sortZerosandOnces(arr);
        
    }
}
