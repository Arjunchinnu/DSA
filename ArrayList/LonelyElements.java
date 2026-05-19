// Lonely Numbers in ArrayList (Medium)

// You are given an integer ArrayList nums.

// A number x is called lonely when:

// it appears only once in the ArrayList
// and no adjacent numbers exist in the ArrayList
// (i.e. x + 1 and x - 1 are not present)

// Return all lonely numbers in nums.

// You may return the answer in any order.

// Sample Input 1
// nums = [10,6,5,8]
// Sample Output 1
// [10,8]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class LonelyElements{

    static void lonelyNum(ArrayList<Integer> arr){
        ArrayList <Integer> lonelyElements = new ArrayList<>();

            for (int i = 1; i < arr.size()-1; i++) {

                //first elements
                if((i-1) == 0 &&
                arr.get(i-1) != arr.get(i)&&
                arr.get(i-1)+1 != arr.get(i)
            ){
                lonelyElements.add(arr.get(i-1));
            }

            //middle elements
            if(arr.get(i-1) != arr.get(i) &&
                arr.get(i+1) != arr.get(i) &&
                arr.get(i)-1 != arr.get(i-1)&&
                arr.get(i)+1 != arr.get(i+1)
            ){
                lonelyElements.add(arr.get(i));
            }

            //last elements
            if((i+1) == arr.size()-1 &&
                arr.get(i+1) != arr.get(i) &&
                arr.get(i+1)+1 != arr.get(i)
            ){
                lonelyElements.add(arr.get(i+1));
            }


            }

        System.out.println(lonelyElements);
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,3));
        Collections.sort(arr);
        lonelyNum(arr);
    }
}