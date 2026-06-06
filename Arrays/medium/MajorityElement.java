// Find the Majority Element that occurs more than N/2 times

// Problem Statement: Given an integer array nums of size n, return the majority element of the array.

// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

// Examples
// Example 1:
// Input:
//  nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
// Output:
//  7  
// Explanation:
//  The number 7 appears 5 times in the 9-sized array, making it the most frequent element.

// Example 2:
// Input:
//  nums = [1, 1, 1, 2, 1, 2]  
// Output:
//  1  
// Explanation:
//  The number 1 appears 4 times in the 6-sized array, making it the most frequent element.

public class MajorityElement {

    static int majorityElement(int[] arr){

        int count = 0;
        int element = Integer.MIN_VALUE;

        for(int num: arr){

            if(count == 0){
                count = 1;
                element = num;
            }else if(element == num){
                count++;
            }else{
                count--;
            }

            
        }

        int count2 = 0;

            for(int num : arr){
                if(element == num){
                    count2++;
                }
            }

            if(count2 > arr.length / 2){
                return element;
            }

            return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {7,0,0,1,7,7,2,7,7};
        System.out.println(majorityElement(arr));
    }
}
