// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> mp = new HashMap<>();

//         for(int i = 0; i < nums.length; i++){
//             mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);
//         }

//         int maxelement = nums[0];
//         int maxcount = 0;
//         for(int i = 0; i < nums.length; i++){
//             int freq = mp.get(nums[i]);

//             if(freq > maxcount){
//                 maxcount = freq;
//                 maxelement = nums[i];
//             }
//         }

//         return maxelement;
//     }
// }


class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int candidate = 0;

        for(int i = 0; i < nums.length; i++){
            if(vote == 0) candidate = nums[i];

            if(nums[i] == candidate){
                vote++;
            }else{
                vote--;
            }
        }
        return candidate;
    }
}



