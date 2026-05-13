// Left Rotate the Array by One


// Problem Statement: Given an integer array nums, rotate the array to the left by one.

// Note: There is no need to return anything, just modify the given array.

// Examples
// Example 1:
// Input:
//  nums = [1, 2, 3, 4, 5]  
// Output:
//  [2, 3, 4, 5, 1]  

// Explanation:
//  Initially, nums = [1, 2, 3, 4, 5]  
// Rotating once to the left results in nums = [2, 3, 4, 5, 1].



import java.util.Arrays;

public class Left_Rotate_1 {

    static void rotate(int[] arr){

        //storing 1st element
        int temp = arr[0];

        //loop to shift elements
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        //placing last element
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
    }
}
