public class MajorityElement {

    static int majorityElement(int[] arr){

        int count = 0;
        int element = Integer.MIN_VALUE;

        for(int num: arr){

            if(count == 0){
                count = 1;
                element = num;
            }else if(element == num){
                count++;
            }else{
                count--;
            }

            
        }

        int count2 = 0;

            for(int num : arr){
                if(element == num){
                    count2++;
                }
            }

            if(count2 > arr.length / 2){
                return element;
            }

            return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {7,0,0,1,7,7,2,7,7};
        System.out.println(majorityElement(arr));
    }
}
