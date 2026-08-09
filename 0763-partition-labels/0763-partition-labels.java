class Solution {
    public List<Integer> partitionLabels(String s) {
        int []arr = new int[26];

        for(int i = s.length()-1; i >= 0; i--){
            if(arr[s.charAt(i) - 'a'] == 0) arr[s.charAt(i) - 'a'] = i;
        }

        int partitionStart = 0;
        int i = 0;
        int j = arr[s.charAt(0) - 'a'];

        List<Integer> list = new ArrayList<>();

        while(partitionStart < s.length()){

            if(i == j){
                list.add(j-partitionStart+1);
                partitionStart = j+1;
                i++;

                if(j+1 < s.length()) j = arr[s.charAt(j+1) - 'a'];

            }else if(arr[s.charAt(i)-'a'] > j){

                j = arr[s.charAt(i)-'a'];
                i++;
            }

            else{

                i++;
            }
        }
        return list;
    }
}