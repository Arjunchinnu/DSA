
import java.util.Arrays;

public class SortZerosOnces {

    static void sortZerosandOnces(int[] arr){
        int left = 0;
        int mid = 0;
        int right = arr.length -1;

        while(mid <= right){

            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;

                left++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;

                right--;
            }

            
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {

        int[] arr = {1,0,2,1,0};
        sortZerosandOnces(arr);
        
    }
}
