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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int len = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                ListNode temp = slow;
                do{
                    len++;
                    temp = temp.next;
                }while(temp != slow);

                break;
            }
        }

        if(len == 0) return null;

        ListNode f = head;
        ListNode s = head;

        while(len > 0){
            len--;
            f = f.next;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
        }

        return f;
    }
}