/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 // Reservoir sampling --> O(1) extra space
class Solution {
    ListNode head;
    Random random = new Random();

    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        ListNode curr = head;

        int ans = curr.val;
        int count = 1;

        curr = curr.next;

        while(curr != null){

            count++;

            //pick current node with probability 1/count
            if(random.nextInt(count) == 0){
                ans = curr.val;
            }

            curr = curr.next;

        }

        return ans;
    }
}

// class Solution {
//     ArrayList<Integer> list = new ArrayList<>();
//     Random random = new Random();

//     public Solution(ListNode head) {
//         ListNode temp = head;

//         while(temp != null) {
//             list.add(temp.val);
//             temp = temp.next;
//         }   
//     }
    
//     public int getRandom() {
//         int index = random.nextInt(list.size());
//         return list.get(index);
//     }
// }


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */