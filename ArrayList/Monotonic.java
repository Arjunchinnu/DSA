// Monotonic ArrayList (Easy)
// An ArrayList is monotonic if it is either monotone increasing or monotone decreasing.
// An ArrayList nums is monotone increasing if for all i <= j:
// nums.get(i) <= nums.get(j)
// An ArrayList nums is monotone decreasing if for all i <= j:
// nums.get(i) >= nums.get(j)

// Sample Input 1
// nums = [1,2,2,3]
// Sample Output 1
// true

// sample Input 3
// nums = [1,3,2]
// Sample Output 3
// false


import java.util.ArrayList;
import java.util.Arrays;

class Solution{

    static boolean monarch(ArrayList<Integer> arr){
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) < arr.get(i+1)){
                dec = false;
            }
            if(arr.get(i) > arr.get(i+1)){
                inc = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(1,2,2,4,1));
        System.out.println(monarch(arr));
    }
}