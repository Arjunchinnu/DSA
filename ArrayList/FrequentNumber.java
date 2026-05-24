// Most Frequent Number Following Key (Easy)

// You are given an integer ArrayList nums and an integer key which is present in nums.

// For every unique integer target in nums, count how many times target immediately follows an occurrence of key.

// In other words, count the number of indices i such that:

// 0 <= i <= nums.size() - 2
// nums.get(i) == key
// nums.get(i + 1) == target

// Return the target with the maximum count.

// It is guaranteed that the answer is unique.

// Example 1
// Input
// nums = [1,100,200,1,100]
// key = 1
// Output
// 100
// Explanation

// For target = 100, there are 2 occurrences that immediately follow key = 1.

// No other integer follows 1 more frequently.

// So, the answer is:

// 100
// Example 2
// Input
// nums = [2,2,2,2,3]
// key = 2
// Output
// 2
// Explanation

// Numbers following 2 are:

// 2, 2, 2, 3

// Frequency count:

// 2 → 3 times
// 3 → 1 time

// Since 2 has the highest frequency, return:

// 2
// Constraints
// 2 <= nums.size() <= 1000
// 1 <= nums.get(i) <= 1000
// The answer is guaranteed to be unique.
// Hint
// Count how many times each number appears immediately after key.
// Return the number with the highest count.



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FrequentNumber {

    static int frequency(ArrayList <Integer> nums,int key){

        int[] result = new int[1000];

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans=0;
        for (int i = 0; i < result.length; i++) {
            if(result[i] > max){
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(2,2,2,2,4));
        int key = 2;
        System.out.println(frequency(nums, key));
    }
}
