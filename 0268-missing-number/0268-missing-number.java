// brute 

// class Solution {
//     public int missingNumber(int[] nums) {
//         for(int i = 0; i < nums.length; i++){
//             boolean flag = false;
//             for(int j = 0; j < nums.length; j++){
//                 if(i == nums[j]) flag = true;
//             }
//             if(!flag) return i;
//         }
//         return nums.length;
//     }
// }


class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctpos = nums[i];
            if(correctpos < nums.length && nums[i] != i){
                swap(nums,correctpos,i);
            }else{
                i++;
            }
        }

        for(int idx = 0; idx < nums.length; idx++){
            if(idx != nums[idx]) return idx;
        }

        return nums.length;
    }
    public void swap(int []nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}