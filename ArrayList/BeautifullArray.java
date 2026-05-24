// Beautiful ArrayList (MEDIUM)

// An ArrayList nums of size n is beautiful if:

// nums is a permutation of the integers in the range [1, n].
// For every 0 <= i < j < n, there is no index k with i < k < j such that:
// 2×nums.get(k)=nums.get(i)+nums.get(j)

// Given the integer n, return any beautiful ArrayList nums of size n.

// There will be at least one valid answer for the given n.

// Sample Input 1
// n = 4
// Sample Output 1
// [2, 1, 4, 3]
// Sample Input 2
// n = 5
// Sample Output 2
// [3, 1, 2, 5, 4]
// Constraints
// 1 <= n <= 1000


import java.lang.reflect.Array;
import java.util.ArrayList;

class BeautifullArray{

    static ArrayList<Integer> beautify(int n){

        ArrayList <Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < n) {
            
            ArrayList <Integer> temp = new ArrayList<>();

                for( int e: ans){
                    if(2*e-1 <= n) temp.add(e*2-1);
                }

                for( int e: ans){
                    if(2*e <= n) temp.add(e*2);
                }

                
                 ans = temp;
            }
           
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(beautify(4));
    }
}