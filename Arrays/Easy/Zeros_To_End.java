// Move all Zeros to the end of the array


// Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

// Examples
// Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

import java.util.Arrays;

public class Zeros_To_End {
           
    static void zerosToEnd(int[] arr){
      int j =-1;

      //to find zero position
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==0){
                j = i;
                break;
            }
        }

        //returns if all zeros already in last
            if(j == -1){
                return;
            }

            //swaping
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0};
        zerosToEnd(arr);
    }
}
