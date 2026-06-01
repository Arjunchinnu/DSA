

// Find the number that appears once, and the other numbers twice

// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

// Examples
// Example 1:
// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.


// Example 2:
// Input Format: arr[] = {4,1,2,1,2}
// Result: 4
// Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.


import java.util.HashMap;
import java.util.Map;
class NumberAppearOnce{

    // public static int appearOnce(int[] arr){
    //     int result = arr[0];

    //     for (int i = 0; i < arr.length; i++) {
    //         int count = 0;
    //         for (int j = 0; j < arr.length; j++) {
                
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }

    //         }
    //         if(count == 1){
    //                 result = arr[i];
    //                 return result;
    //             }
            
    //     }
    //     return -1;
    // }


    //hashmap

    // public static int appearOnce(int[] arr){

    //     Map <Integer,Integer> digits = new HashMap<>();

    //     for(int num : arr){
    //             digits.put(num,digits.getOrDefault(num,0)+1);      
    //     }
    //     System.out.println(digits);

    //     for(Integer key : digits.keySet()){
    //         if( digits.get(key) == 1){
    //             return key;
    //         }
    //     }

    //     return -1;
    // }

    public static int appearOnce(int[] arr){
        int xor = 0;
        
        for(int num : arr){
            xor = xor ^ num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(appearOnce(arr));
    }
}