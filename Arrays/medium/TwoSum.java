// Two Sum : Check if a pair with given sum exists in Array

// Problem Statement: Given an array of integers arr[] and an integer target.

// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

// Examples

// Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
// Output : YES
// Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant output will be : [1,3].

// Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
// Output : NO.
// Explanation: There exist no such two numbers whose sum is equal to the target. 

import java.util.HashSet;

class TwoSum{


    static boolean twoSum(int[] arr,int target){

        HashSet <Integer> set = new HashSet<>();

        for(int num :arr){
            int candidate = target - num;

            if(set.contains(candidate)){
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] a){
        int n = 5;
        int[] arr = {2,6,5,8,11};
        int target = 15;

        System.out.println(twoSum(arr, target)?"yes":"no");
    }

}