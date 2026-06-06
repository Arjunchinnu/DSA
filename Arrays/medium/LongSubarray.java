class LongSubarray {
    public static int longestSubarray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxCount = 0;
        while(right < nums.length){

            sum += nums[right];
            right++;

            while(sum > k){
                sum -= nums[left];
                left++;
            }
           

            if(sum == k){
                maxCount = Math.max(maxCount,(right - left));
            }
        }
        return maxCount;
       
    }

     public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(longestSubarray(arr,k));
}

    }
   