/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthCycle(ListNode node){
        ListNode fast = node;
        ListNode slow = node;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                // find length;

                int length = 0;
                ListNode temp = slow;

                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0) return null;

        ListNode f = head;
        ListNode s = head;

        // move pointer s where fast and slow met eachother
        while(length > 0){
            s = s.next;
            length--;
        }

        // keep movinf f from head(start) and s from fast pointer and where ever they 
        // meet will be the start point
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
}