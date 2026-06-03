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


class TwoSum{

    static boolean twoSum(int[] arr,int n,int target){
        int left = 0;
        int right = n-1;
        int sum = 0;

        while(left != n){
            sum = arr[left] + arr[right];

            if(sum == target){
                return true;
            }

            if(left == right){
                right = n-1;
                left++;
            }
            right --;
        }
        return false;

    }

    public static void main(String[] a){
        int n = 5;
        int[] arr = {2,6,5,8,11};
        int target = 14;

        System.out.println(twoSum(arr, n, target)?"yes":"no");
    }

}