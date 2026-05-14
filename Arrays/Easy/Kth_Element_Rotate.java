
import java.util.Arrays;

public class Kth_Element_Rotate {

    static void rotate(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }

    static void kRotate(int[] arr,int k,String direction){
            int n = arr.length-1;
        if(direction.equalsIgnoreCase("left")){

            //resever's whole array
            rotate(arr, 0, n);

            //resever array except kth elements
            rotate(arr, k ,n);

            //resever only kth elements
            rotate(arr, 0, k-1);

        }

        if(direction.equalsIgnoreCase("right")){

             //resever's whole array
            rotate(arr, 0, n);

            //resever array except kth elements
            rotate(arr, 0, n-k);

            //resever only kth elements
            rotate(arr, n-k+1, n);
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        String direction = "right";
        kRotate(arr, k, direction);
        System.out.println(Arrays.toString(arr));
    }
}
