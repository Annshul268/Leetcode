// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;

//         int []positive = new int[n/2];
//         int []negative = new int[n/2];

//         int i = 0, j = 0, k = 0;

//         while(k < nums.length){
//             if(nums[k] >= 0){
//                 positive[i] = nums[k];
//                 i++;
//             }else{
//                 negative[j] = nums[k];
//                 j++;
//             }
//             k++;
//         }

//         i = 0;
//         j = 0; 
//         k = 0;

//         while(i < n/2){
//             nums[k] = positive[i];
//             i++;
//             k++;
//             nums[k] = negative[j];
//             j++;
//             k++;
//         }

//         return nums;
//     }
// }

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int []ans = new int[n];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos+=2;
            }else{
                ans[neg] = nums[i];
                neg+=2;
            }
        }

        return ans;
    }
}