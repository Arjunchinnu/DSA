wpublic class LongSubarray {

    public static int kSubArray(int[] arr,int target){
        
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j = i;j < arr.length;j++){
                int sum = 0;
                int count = 0;

                for(int k = i;k<=j;k++){
                    sum += arr[k];
                    count++;
                }
                if(sum == target && count > max){
                    max = count;
                }
            }
        }

       return max;
    }

    public static void main(String[] a){
        int[] arr = {10, 5, 2, 7, 1, 9};
        int target = 15;
        
        System.out.println(kSubArray(arr,target));
    }
    
}