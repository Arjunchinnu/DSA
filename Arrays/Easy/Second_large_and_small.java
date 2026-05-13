// Find Second Smallest and Second Largest Element in an array


// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// Examples
// Example 1:
// Input:
//  [1, 2, 4, 7, 7, 5]  

// Output:
// Second Smallest : 2  
// Second Largest : 5  
// Explanation:
//   The elements are sorted as 1, 2, 4, 5, 7, 7.  
// Hence, the second smallest element is 2, and the second largest element is 5.

class Second_large_and_small{

        static void findElements(int[] arr){

            // varibles to store values
            int smallest = Integer.MAX_VALUE,small = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE,large = Integer.MIN_VALUE;

            //loop to get largest and smallest elements
            for (int i = 0; i < arr.length; i++) {
                smallest = Math.min(arr[i], smallest);
                largest = Math.max(arr[i], largest);
            }
            System.out.println("largest :"+largest+" smallest "+smallest);

            //loop to get second largest and second smallest
            for (int i = 0; i < arr.length; i++) {

                //second smallest
                if(arr[i] < small && arr[i] != smallest){
                    small = arr[i];
                }
                //second largest
                if(arr[i] > large && arr[i] != largest){
                    large = arr[i];
                }
            }

            System.out.println("Second largest "+large+" second smallest "+small);
        }
    public static void main(String[] args) {
        int[] arr ={1, 2, 4, 7, 7, 5};
        findElements(arr);
    }
}
