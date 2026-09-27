class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int []positive = new int[n/2];
        int []negative = new int[n/2];

        int i = 0, j = 0, k = 0;

        while(k < nums.length){
            if(nums[k] >= 0){
                positive[i] = nums[k];
                i++;
            }else{
                negative[j] = nums[k];
                j++;
            }
            k++;
        }

        i = 0;
        j = 0; 
        k = 0;

        while(i < n/2){
            nums[k] = positive[i];
            i++;
            k++;
            nums[k] = negative[j];
            j++;
            k++;
        }

        return nums;
    }
}