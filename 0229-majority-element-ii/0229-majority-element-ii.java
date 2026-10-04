class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int unique = nums[0];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == unique){
                count++;
            }else{
                if(count > n/3) ans.add(unique);
                unique = nums[i];
                count = 1;
            }
        }

        if(count > n/3) ans.add(unique);

        return ans;
    }
}