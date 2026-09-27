// class Solution {
//     public int removeDuplicates(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i = 0; i < nums.length; i++){
            
//         }
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
    
        int i = 0;
        int j = i+1;

        while(j < nums.length){
            if(nums[j] != nums[i]){
                swap(nums,i+1,j);
                i++;
                j++;
                
            }else{
                j++;
            }
        }

        return i+1;
    }
    public void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}