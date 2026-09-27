// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length;
//         int [] ans = new int[n];

//         int k = 0;
//         for(int i = 0; i < n; i++){
//             if(nums[i] != 0){
//                 ans[k] = nums[i];
//                 k++;
//             }
//         }

//         for(int i = 0; i < n; i++){
//             nums[i] = ans[i];
//         }
//     }
// }


// optimal
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int j = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j != -1){
            for(int i = j+1; i < n; i++){
                if(nums[i] != 0){
                    swap(nums,i,j);
                    j++;
                }
            }
        }
        
    }
    public void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}