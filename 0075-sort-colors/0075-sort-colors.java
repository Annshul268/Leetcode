// QUICK SORT

// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0;
//         int hi = nums.length-1;
//         sort(nums,low,hi);
//     }
//     public void sort(int[] nums ,int low ,int hi){
//         if(low > hi){
//             return;
//         }
//         int s = low;
//         int e = hi;
//         int m = s + (e-s)/2;
//         int pivot = nums[m];

//         while(s <= e){

//             while(nums[s] < pivot){
//                 s++;
//             }
//             while(nums[e] > pivot){
//                 e--;
//             }

//             if(s <= e){
//                 int temp = nums[s];
//                 nums[s] = nums[e];
//                 nums[e] = temp;
//                 s++;
//                 e--;
//             }
//         }
//         sort(nums,low,e);
//         sort(nums,s,hi);

//     }
// }


class Solution {
    public void sortColors(int[] nums) {
        int low = 0 , mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public void swap(int [] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}